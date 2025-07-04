/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GameShopEngine;

import org.joml.*;

/**
 *
 * @author gameshopengine
 */
public class GameShopCamera {
    
    public static final float FOV = (float)org.joml.Math.toRadians(60f);
    public static final float Z_FAR = 1000f;
    public static final float Z_NEAR = 1.5f;
    
    public Matrix4f projMatrix;
    public Matrix4f viewMatrix;
    
    public Vector3f position;
    public Vector3f rotation;
    
    
    public GameShopCamera(Vector3f position, Vector3f rotation, int width, int height){
    
        this.position = position;
        this.rotation = rotation;
        
        projMatrix = new Matrix4f();
        viewMatrix = new Matrix4f();
        updateProjMatrix(width, height);
        
    }
    
    public void updateProjMatrix(int width, int height){
    
        projMatrix.setPerspective(FOV, (float)width/height, Z_NEAR, Z_FAR);
        projMatrix.lookAt(position, new Vector3f(0, 0, -10), new Vector3f(0, 1, 0));
    }
    
    public Matrix4f getViewMatrix() {
     

    viewMatrix.identity();
    // First do the rotation so camera rotates over its position
    viewMatrix.rotate((float)org.joml.Math.toRadians(rotation.x), new Vector3f(1, 0, 0))
        .rotate((float)org.joml.Math.toRadians(rotation.y), new Vector3f(0, 1, 0));
    // Then do the translation
    viewMatrix.translate(-position.x, -position.y, -position.z);
    return viewMatrix;
}
    
    
//    public Matrix4f getModelViewMatrix(GameItem gameItem, Matrix4f viewMatrix) {
//    Vector3f rotation = gameItem.getRotation();
//    modelViewMatrix.identity().translate(gameItem.getPosition()).
//        rotateX((float)Math.toRadians(-rotation.x)).
//        rotateY((float)Math.toRadians(-rotation.y)).
//        rotateZ((float)Math.toRadians(-rotation.z)).
//        scale(gameItem.getScale());
//    Matrix4f viewCurr = new Matrix4f(viewMatrix);
//    return viewCurr.mul(modelViewMatrix);
//}
}
