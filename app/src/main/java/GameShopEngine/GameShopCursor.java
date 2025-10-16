/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GameShopEngine;

import GameShopEngine.PolyHash.GameShopObjectHash;
import GameShopEngine.PolyHash.GameShopPolyMeshHash;
import com.jme3.math.Ray;
import org.joml.Intersectionf;
import org.joml.Vector2f;
import org.joml.Vector3f;
import org.joml.Vector4f;

/**
 *
 * @author gameshopengine
 */
public class GameShopCursor {
    
    public Vector2f screenSize;
    public Vector2f cursorPosition;
    public Vector2f glPosition;
    
    public Vector2f vidModeSize;
    public Vector2f finalSize;
    
    public boolean clicked;
    
    
    private static GameShopCursor _instance;
    
    private GameShopCursor(){
    
        screenSize = new Vector2f();
        cursorPosition = new Vector2f();
        glPosition = new Vector2f();
        vidModeSize = new Vector2f();
        finalSize = new Vector2f();
    }
    
    public static GameShopCursor getInstance(){
    
        if (_instance == null){
        
            _instance = new GameShopCursor();
        }
        return _instance;
    }
    
//    public void setScreenSize(float x, float y){
//    
//        screenSize.set(x, y);
//        
//    }
//    
//    public void setCursorPosition(float x, float y){
//    
//        cursorPosition.set(x, y);
//    }
    
    public void convertToGLPosition(){
    
        glPosition.set((((-(screenSize.x)/2) + cursorPosition.x)/screenSize.x) * 2,-(((-(screenSize.y)/2) + cursorPosition.y)/screenSize.y) * 2);
       //glPosition.set(((cursorPosition.x/screenSize.x) * 2) - 1f, 1f - ((cursorPosition.y/screenSize.y)) * 2);
    }
    
    public com.jme3.math.Vector3f rayCast(){
    
        
int id = 0;
for (GameShopObject gso: GameShopObjectHash.getInstance().objectHash.values()){
 for (GameShopPolyMesh gspm: GameShopPolyMeshHash.getInstance().polyMeshHash.values()){
    for (GameShopPolySurface gsps: gspm.gspSurfaces){     
//        int x = 0;
//        int x1 = 1;
//        int y = 0;
//        int y1 = 1;
        //ByteBuffer objectDataBuffer = BufferUtils.createByteBuffer(1 * (4 + 12 + 12));
    
        for (int liney = 0; liney < gsps.vInfinitesimals.length - 1; liney++){
            for (int linex = 0; linex < gsps.vInfinitesimals.length - 1; linex++){
        
               // objectDataBuffer.putInt(id);
                org.joml.Vector3f min = GameShopTypeConverter.getInstance().convertVector3fFromJMEToJOML(gsps.vInfinitesimals[liney].infinitesimals[linex]);
                //org.joml.Vector4f min4f = new org.joml.Vector4f(min.x, min.y, min.z, 1.0f);
                //min.get(objectDataBuffer);
                org.joml.Vector3f upperMid = GameShopTypeConverter.getInstance().convertVector3fFromJMEToJOML(gsps.vInfinitesimals[liney].infinitesimals[linex + 1]);
                org.joml.Vector3f lowerMid = GameShopTypeConverter.getInstance().convertVector3fFromJMEToJOML(gsps.vInfinitesimals[liney + 1].infinitesimals[linex]);
                org.joml.Vector3f max = GameShopTypeConverter.getInstance().convertVector3fFromJMEToJOML(gsps.vInfinitesimals[liney + 1].infinitesimals[linex + 1]);
                //org.joml.Vector4f max4f = new org.joml.Vector4f(max.x, max.y, max.z, 1.0f);

                org.joml.Vector4f min4f = new Vector4f(min.x, min.y, min.z, 1.0f);
                org.joml.Vector4f max4f = new Vector4f(max.x, max.y, max.z, 1.0f);
//max.get(objectDataBuffer);
                org.joml.Matrix4f projMatrix = new org.joml.Matrix4f(GameShopCameraHub.getInstance().gsCameras.get("UI").projMatrix);
                org.joml.Matrix4f modelMatrix = new org.joml.Matrix4f(GameShopObjectHash.getInstance().objectHash.get("UI-Object-1").getModelMatrix());
                org.joml.Matrix4f viewMatrix = new org.joml.Matrix4f(GameShopCameraHub.getInstance().gsCameras.get("UI").getViewMatrix());
                org.joml.Matrix4f invProjMatrix = new org.joml.Matrix4f(projMatrix).invert();
                org.joml.Matrix4f invViewMatrix = new org.joml.Matrix4f(viewMatrix).invert();
                
                org.joml.Vector4f dir = new org.joml.Vector4f(glPosition.x, glPosition.y, -1f, 1f);
                dir.mul(invProjMatrix);
                dir.z = -1;
                dir.w = 0;
                dir.mul(invViewMatrix);
                
                dir.normalize();
//modelMatrix.mul(viewMatrix.mul(projMatrix)).transformPosition(min4f);
                //modelMatrix.mul(viewMatrix.mul(projMatrix)).transformPosition(max4f);
                min4f.mul(modelMatrix);
                max4f.mul(modelMatrix);
                //modelMatrix.transformPosition(max);
//                System.out.println("ProjMatrix: " + projMatrix);
//                System.out.println("InvProjMatrix: " +  invProjMatrix);
//                System.out.println("Dir: " + dir);
                System.out.println("Min: " + min4f);
                System.out.println("Max: " +  max4f);
                System.out.println("Dir: " + dir);
                
                Ray ray = new Ray(GameShopTypeConverter.getInstance().convertVector3FromJOMLToJME(GameShopCameraHub.getInstance().gsCameras.get("UI").position), new com.jme3.math.Vector3f(0, 0, -1f));//GameShopTypeConverter.getInstance().convertVector3FromJOMLToJME(new Vector3f(dir.x, dir.y, dir.z)));
                
                com.jme3.math.Vector3f result = new com.jme3.math.Vector3f();
                boolean upper = ray.intersectWhere(GameShopTypeConverter.getInstance().convertVector3FromJOMLToJME(min), GameShopTypeConverter.getInstance().convertVector3FromJOMLToJME(upperMid), GameShopTypeConverter.getInstance().convertVector3FromJOMLToJME(max), result);
                boolean lower = ray.intersectWhere(GameShopTypeConverter.getInstance().convertVector3FromJOMLToJME(min), GameShopTypeConverter.getInstance().convertVector3FromJOMLToJME(lowerMid), GameShopTypeConverter.getInstance().convertVector3FromJOMLToJME(max), result);
                System.out.println(upper);
                System.out.println(lower);
                if (upper){
                
                    System.out.println("result " + result);
                    return result;
                    
                } else if (lower) {
                
                    System.out.println("result " + lower);
                    return result;
                }
// org.joml.Matrix4f projViewMatrix = new org.joml.Matrix4f(projMatrix.mul(viewMatrix));
                //org.joml.Vector3f glAngle = new Vector3f();
               // projViewMatrix.transformPosition(new Vector3f(glPosition.x, glPosition.y, 0), glAngle);
                //Vector3f dir = projViewMatrix.frustumRayDir(glPosition.x + 1, glPosition.y + 1, new Vector3f(0,0,1));
                //glAngle.add(GameShopCameraHub.getInstance().gsCameras.get("UI").position);
                //org.joml.Vector3f dir = new Vector3f();
               // projViewMatrix.transformDirection(glAngle, dir);
                // GameShopUniformHub.getInstance().get(GameShopShaderHash.getInstance().getGLShaderProgram("Hello GameShop")).setUniform("txtSampler", 0);
                //projViewMatrix.frustumRayDir(id, id, min)
                 //System.out.println("GLANGLE" + glAngle);
               // if (Intersectionf.testRayAab​(GameShopCameraHub.getInstance().gsCameras.get("UI").position, new Vector3f(dir.x, dir.y, dir.z), min, max)){
//                org.joml.Vector2f intersectionPoint = new Vector2f();
//                boolean out = Intersectionf.intersectRayAab​(GameShopCameraHub.getInstance().gsCameras.get("UI").position, new Vector3f(dir.x, dir.y, dir.z), new Vector3f(min4f.x, min4f.y, min4f.z), new Vector3f(max4f.x, max4f.y, max4f.z), intersectionPoint);
//                if (out){
//                System.out.println(out);
//                
//                System.out.println("Intersection: " + intersectionPoint);
//                //return null;
//                }
                //}

               // id++;
            }
        }
        
        
//        for (MyObject obj : sceneObjects) {
//            objectDataBuffer.putInt(obj.getId());
//            obj.getMinBounds().get(objectDataBuffer);
//            obj.getMaxBounds().get(objectDataBuffer);
//        }
//        obj43.glBindBufferBase(GL43.GL_SHADER_STORAGE_BUFFER, 0, ssbo); // Bind to binding point 0
    
    }
    
    }
}
    return null;
    
    }
    
//    public void initFinalSize(){
//    
//        finalSize.set(0, 0)
//    }
//    public void onClick(){
//    
//        clicked = true;
//    }
    
}
