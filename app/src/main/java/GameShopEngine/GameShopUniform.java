/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GameShopEngine;

import java.nio.FloatBuffer;
import java.util.HashMap;
import org.joml.Matrix4f;
import static org.lwjgl.opengl.GL20.glGetUniformLocation;
import static org.lwjgl.opengl.GL20.glUniform1i;
import static org.lwjgl.opengl.GL20.glUniformMatrix4fv;
import org.lwjgl.opengl.GL30;
import org.lwjgl.opengl.GL46;
import org.lwjgl.system.MemoryStack;

/**
 *
 * @author gameshopengine
 */
public class GameShopUniform {
    
    public int shaderProgram;
    
    public HashMap<String, Integer> uniforms;
    
    public GameShopUniform(int shaderProgram){
    
        this.shaderProgram = shaderProgram;
        uniforms = new HashMap<String, Integer>();
    }
    
    public void createUniform(String uniformName) {
        int uniformLocation = glGetUniformLocation(shaderProgram, uniformName);
        if (uniformLocation < 0) {
            throw new RuntimeException("Could not find uniform [" + uniformName + "] in shader program [" +
                    shaderProgram + "]" + uniformLocation);
        }
        System.out.println("Uniform" + uniformLocation);
        uniforms.put(uniformName, uniformLocation);
    }
    
    private int getUniformLocation(String uniformName) {
        Integer location = uniforms.get(uniformName);
        if (location == null) {
            throw new RuntimeException("Could not find uniform [" + uniformName + "]");
        }
        return location.intValue();
    }
    
      public void setUniform(String uniformName, int value) {
        glUniform1i(getUniformLocation(uniformName), value);
       
    }
      
     public void setUniform(String uniformName, Matrix4f value) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            Integer location = uniforms.get(uniformName);
            if (location == null) {
                throw new RuntimeException("Could not find uniform [" + uniformName + "]");
            }
            
//            FloatBuffer fb = FloatBuffer.allocate(16);
//            value.get(fb);
            
           //GL46.glUniformMatrix4fv(0, true, value);
            //glUniformMatrix4fv(location.intValue(), false, value.get(stack.calloc(16)).asFloatBuffer());
        glUniformMatrix4fv(location.intValue(), false, value.get(stack.mallocFloat(16)));
        }
    }
}
