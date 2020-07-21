package com.angrybirds.game;

import static com.angrybirds.game.game.PPM;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.badlogic.gdx.physics.box2d.World;


public class Obstacle extends Everything{
	public Obstacle(World world, int x , int y , int width , int height , boolean isStatic , Sprite sprite) {
		super(world , x , y , width , height , isStatic , sprite);
		body = create(x,y,width,height,isStatic,world);
	}
	public int getCondition() {
		if (health > 50)
			return 0 ;
		else return 1;
	}

		@Override
		protected Body create(int x, int y, int width, int height, boolean isStatic, World world) {

				Body pBody;
				BodyDef def = new BodyDef();
				if(isStatic)
						def.type = BodyDef.BodyType.StaticBody;
				else
						def.type = BodyDef.BodyType.DynamicBody;
				def.position.set(x/PPM,y/PPM);
				def.fixedRotation = false ;
				def.angularDamping = 15f;




				pBody = world.createBody(def);
				FixtureDef fixtureDef = new FixtureDef();
				PolygonShape shape = new PolygonShape();
				shape.setAsBox(width/PPM , height/PPM);

				fixtureDef.shape = shape ;
				fixtureDef.restitution = 0.5f;
				fixtureDef.friction = 0.5f ;
				fixtureDef.density = 1f;



				pBody.createFixture(fixtureDef);
				shape.dispose();
				return pBody;
		}
}
