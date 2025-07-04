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
public class GameShopObject {

    public Matrix4f modelMatrix;
    public Vector3f position;
    public Quaternionf rotation;
   // public Vector3f angle;
    
    public float scale;
    GameShopPolyMesh polyMesh;
    
    public GameShopObject(GameShopPolyMesh polys){
        modelMatrix = new Matrix4f();
        position = new Vector3f();
        rotation = new Quaternionf();
        scale = 1;
        this.polyMesh = polys;
        updateModelMatrix();
    }
    
    public Matrix4f getModelMatrix() {
        return modelMatrix;
    }

    public Vector3f getPosition() {
        return position;
    }

    public Quaternionf getRotation() {
        return rotation;
    }

    public float getScale() {
        return scale;
    }

    public final void setPosition(float x, float y, float z) {
        position.x = x;
        position.y = y;
        position.z = z;
    }

    public void setRotation(float x, float y, float z, float angle) {
        this.rotation.fromAxisAngleRad(x, y, z, angle);
    }

    public void rotate(float x, float y, float z){
        
        this.rotation.rotateXYZ(x, y, z);
    
    }
    public void setScale(float scale) {
        this.scale = scale;
    }

    public void updateModelMatrix() {
        modelMatrix.translationRotateScale(position, rotation, scale);
        //modelMatrix.translationRotateS
    }
}
