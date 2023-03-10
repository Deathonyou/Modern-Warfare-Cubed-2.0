// Date: 2/17/2019 2:10:50 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class BodyBag extends ModelBase
{
  //fields
    ModelRenderer bodybag1;
    ModelRenderer bodybag2;
    ModelRenderer bodybag3;
    ModelRenderer bodybag4;
    ModelRenderer bodybag5;
    ModelRenderer bodybag6;
    ModelRenderer bodybag7;
    ModelRenderer bodybag8;
    ModelRenderer bodybag9;
    ModelRenderer bodybag10;
    ModelRenderer bodybag11;
  
  public BodyBag()
  {
    textureWidth = 256;
    textureHeight = 256;
    
      bodybag1 = new ModelRenderer(this, 0, 0);
      bodybag1.addBox(0F, 0F, 0F, 8, 8, 8);
      bodybag1.setRotationPoint(-4F, 17F, 5F);
      bodybag1.setTextureSize(256, 256);
      bodybag1.mirror = true;
      setRotation(bodybag1, 0.0743572F, 0F, 0F);
      bodybag2 = new ModelRenderer(this, 0, 0);
      bodybag2.addBox(0F, 0F, 0F, 8, 4, 12);
      bodybag2.setRotationPoint(-4F, 19.5F, -6F);
      bodybag2.setTextureSize(256, 256);
      bodybag2.mirror = true;
      setRotation(bodybag2, 0.0500879F, 0F, 0F);
      bodybag3 = new ModelRenderer(this, 0, 0);
      bodybag3.addBox(0F, 0F, 0F, 2, 4, 24);
      bodybag3.setRotationPoint(-4F, 21F, -18F);
      bodybag3.setTextureSize(256, 256);
      bodybag3.mirror = true;
      setRotation(bodybag3, 0F, 0F, 1.003822F);
      bodybag4 = new ModelRenderer(this, 0, 0);
      bodybag4.addBox(-2F, 0F, 0F, 2, 4, 24);
      bodybag4.setRotationPoint(4F, 21F, -18F);
      bodybag4.setTextureSize(256, 256);
      bodybag4.mirror = true;
      setRotation(bodybag4, 0F, 0F, -1.003826F);
      bodybag5 = new ModelRenderer(this, 0, 0);
      bodybag5.addBox(-3F, 0F, 0F, 3, 5, 12);
      bodybag5.setRotationPoint(4F, 19.5F, -6F);
      bodybag5.setTextureSize(256, 256);
      bodybag5.mirror = true;
      setRotation(bodybag5, 0F, 0F, -1.226898F);
      bodybag6 = new ModelRenderer(this, 0, 0);
      bodybag6.addBox(0F, 0F, 0F, 3, 5, 12);
      bodybag6.setRotationPoint(-4F, 19.5F, -6F);
      bodybag6.setTextureSize(256, 256);
      bodybag6.mirror = true;
      setRotation(bodybag6, 0F, 0F, 1.226897F);
      bodybag7 = new ModelRenderer(this, 0, 0);
      bodybag7.addBox(0F, 0F, 0F, 8, 12, 4);
      bodybag7.setRotationPoint(-4F, 19.5F, -6F);
      bodybag7.setTextureSize(256, 256);
      bodybag7.mirror = true;
      setRotation(bodybag7, -1.474235F, 0F, 0F);
      bodybag8 = new ModelRenderer(this, 0, 0);
      bodybag8.addBox(0F, 0F, 0F, 8, 8, 3);
      bodybag8.setRotationPoint(-4F, 17F, 5F);
      bodybag8.setTextureSize(256, 256);
      bodybag8.mirror = true;
      setRotation(bodybag8, -1.209441F, 0F, 0F);
      bodybag9 = new ModelRenderer(this, 0, 0);
      bodybag9.addBox(-4F, 0F, 0F, 4, 6, 8);
      bodybag9.setRotationPoint(4F, 17F, 5F);
      bodybag9.setTextureSize(256, 256);
      bodybag9.mirror = true;
      setRotation(bodybag9, 0F, 0F, -0.5576828F);
      bodybag10 = new ModelRenderer(this, 0, 0);
      bodybag10.addBox(0F, 0F, 0F, 4, 6, 8);
      bodybag10.setRotationPoint(-4F, 17F, 5F);
      bodybag10.setTextureSize(256, 256);
      bodybag10.mirror = true;
      setRotation(bodybag10, 0F, 0F, 0.5576851F);
      bodybag11 = new ModelRenderer(this, 0, 0);
      bodybag11.addBox(0F, 0F, 0F, 18, 1, 31);
      bodybag11.setRotationPoint(-9F, 23F, -18F);
      bodybag11.setTextureSize(256, 256);
      bodybag11.mirror = true;
      setRotation(bodybag11, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    bodybag1.render(f5);
    bodybag2.render(f5);
    bodybag3.render(f5);
    bodybag4.render(f5);
    bodybag5.render(f5);
    bodybag6.render(f5);
    bodybag7.render(f5);
    bodybag8.render(f5);
    bodybag9.render(f5);
    bodybag10.render(f5);
    bodybag11.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}