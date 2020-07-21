package com.angrybirds.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.Box2D;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.physics.box2d.World;

public class game2 implements Screen {
		 SpriteBatch batch;

		Texture img;
		Texture Birds;
		Texture background;
		Texture Wood_texture;
		Texture Sling;
		Texture Sling2;
		Sprite test2;
		Sprite test;
		Sprite test1;

		Sprite Wood1Sprite;
		Sprite Wood2Sprite;
		Sprite sprite;
		Sprite SSling;
		Sprite SSling2;
		MainGame Game;
		public game2(MainGame Game)
		{
			this.Game=Game;
		}
		public World world;
		Box2DDebugRenderer dDebugRenderer;
		OrthographicCamera camera;
		int NumOfObjects;
		Everything player, levelObjects[], enemies[] ,bedRock;
		boolean pausePhysics;
		boolean hold;
		public static final float PPM = 32;
		public Vector2 mouseOrigin;
		final int MouseLimit = 50;
	
//		@Override
//		public void create() {
//				Box2D.init();
//				world = new World(new Vector2(0, -10), false);
//				dDebugRenderer = new Box2DDebugRenderer();
//				camera = new OrthographicCamera(20,10);
//				//camera.setToOrtho(false, (float) Gdx.graphics.getWidth() / 2, (float) Gdx.graphics.getHeight() / 2);
//				pausePhysics = true;
//				hold = false;
//
//				NumOfObjects = 10;
//				batch = new SpriteBatch();
//				batch.setProjectionMatrix(camera.combined);
//				img = new Texture("Pig.png");
//				Wood_texture = new Texture("Wood1.png");
//				background = new Texture("background.png");
//				Birds = new Texture("RED.png");
//				Sling=new Texture("slingshot.png");
//				test2 = new Sprite(Birds);
//				test = new Sprite(img);
//				test1 = new Sprite(background);
//				SSling=new Sprite(Sling);
//
//				Wood1Sprite= new Sprite(Wood_texture);
//				test2.setSize(50,50);
//				Wood1Sprite.setSize(10/PPM , 30/PPM);
//				test2.setSize(10/PPM , 10/PPM);
//
//				player = new Bird(world, 50, 100, 10, 10, false , test2);
//				player.body.setUserData(test2);
//				enemies = new Pig[5];
//				levelObjects = new Obstacle[NumOfObjects];
//
//				for ( int i = 0 ; i < NumOfObjects ; i++){
//					levelObjects[i] = new Obstacle(world,190 , 75+ i*40,  5,20 , false , Wood1Sprite);
//				}
//
//				for (int i = 0 ; i < 5 ; i++) {
//					enemies[i] = new Pig(world,250 , 75+ i*40,  10,10 , false , Wood1Sprite);
//				}
//
//
//				bedRock = new Obstacle( world ,Gdx.graphics.getWidth() / 2, 55, 1000, 1, true , test1);
//		}

		@Override
		public void render(float delta) {
		if (!pausePhysics)
			world.step(1 / 60f, 6, 2);
			batch.setProjectionMatrix(camera.combined);


				Gdx.gl.glClearColor(135, 206, 236, 1);
				Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
				
				batch.begin();
				batch.draw(test1, 0, 0, 30, 5);
				batch.draw(SSling, 0.95f, 2, 1F, 1.2F);
				batch.draw(SSling2, 0.325f, 1.3f, 1F, 1.2F, 6 ,8, 0.1f, 0.1f, 0);

				if ( Gdx.input.getPressure() == 1 && pausePhysics && includes((Bird) player , new Vector2(Gdx.input.getX()/2,(Gdx.graphics.getHeight() - Gdx.input.getY()) /2 )))
				{
					//System.out.println("sfgnskjdfnas");
					hold =true;
					if (mouseOrigin == null)
					mouseOrigin = new Vector2(Gdx.input.getX() ,Gdx.graphics.getHeight() -  Gdx.input.getY());
				}
				if (hold)
				{
						getMouseInput();
						/**if (Math.abs(mouseOrigin.x - Gdx.input.getX()) <= MouseLimit )
								player.body.setTransform(Gdx.input.getX() , player.body.getPosition().y , 00);
						if (Math.abs(mouseOrigin.y - Gdx.input.getY()) <= MouseLimit )
								player.body.setTransform(player.body.getPosition().x , Gdx.graphics.getHeight() - Gdx.input.getY() , 0);
						 */
				}

			for ( int i = 0 ; i < NumOfObjects ; i++) {
				Wood1Sprite.setBounds(levelObjects[i].body.getPosition().x - Wood1Sprite.getWidth()/(2) , levelObjects[i].body.getPosition().y - Wood1Sprite.getHeight()/(2) , 2*(levelObjects[i].width/PPM),2*(levelObjects[i].height/PPM));
				Wood1Sprite.setOrigin(Wood1Sprite.getWidth()/2 , Wood1Sprite.getHeight()/2);
				Wood1Sprite.setRotation(MathUtils.radiansToDegrees * levelObjects[i].body.getAngle());
				Wood1Sprite.draw(batch);
			}
			for ( int i = 0 ; i < 5 ; i++) {
				test.setBounds(enemies[i].body.getPosition().x - test.getWidth()/(2) , enemies[i].body.getPosition().y - test.getHeight()/(2) , 2*(enemies[i].width/PPM),2*(enemies[i].height/PPM));
				test.setOrigin(test.getWidth()/2 , test.getHeight()/2);
				test.setRotation(MathUtils.radiansToDegrees * enemies[i].body.getAngle());
				test.draw(batch);
			}
			player.sprite.setBounds(player.body.getPosition().x - player.sprite.getWidth()/(2) , player.body.getPosition().y - player.sprite.getHeight()/(2) , 2*(player.width/PPM),2*(player.height/PPM));
			player.sprite.setOrigin(player.sprite.getWidth()/2 , player.sprite.getHeight()/2);
			player.sprite.setRotation(MathUtils.radiansToDegrees * player.body.getAngle());
			player.sprite.draw(batch);
			if(Gdx.input.isTouched())
			{
				player.incV();
				player.sprite.draw(batch);
			}

			batch.end();
			dDebugRenderer.render(world,camera.combined);
			//System.out.println(Gdx.input.getX()/PPM + " " + (Gdx.graphics.getHeight() - Gdx.input.getY())/PPM + " " + player.body.getPosition().x +" " +  player.body.getPosition().y);
		}

	@Override
	public void dispose() {
				batch.dispose();
				img.dispose();
				Birds.dispose();
				background.dispose();
				world.dispose();
				dDebugRenderer.dispose();
		}

	
	@Override
	public void resize(int width, int height) {
		float screenAR = width / (float) height;
		// Our camera needs to be created with new aspect ratio
		// Our visible gameworld width is still 20m but we need to
		// calculate what height keeps the AR correct.
		camera = new OrthographicCamera(20, 20/screenAR);
		// Finally set camera position so that (0,0) is at bottom left
		camera.position.set(camera.viewportWidth / 2, camera.viewportHeight / 2, 0);
		camera.update();

		// If we use spritebatch to draw lets update it here for new camera
		batch = new SpriteBatch();
		// This line says:"Camera lower left corner is 0,0. Width is 20 and height is 20/AR. Draw there!"
		batch.setProjectionMatrix(camera.combined);

	}


	public void moveCamera() {
			Vector3 position = camera.position;
			position.x = player.body.getPosition().x /PPM +400 ;
			position.y = bedRock.body.getPosition().y /PPM+ 200;
			camera.position.set(position);
			camera.update();
	}

	public void getMouseInput() {
		//System.out.println(player.body.getPosition().x + " " + player.body.getPosition().y);
		System.out.println(Gdx.input.getX()/PPM + " " + (Gdx.graphics.getHeight() - Gdx.input.getY())/PPM +" "+ player.body.getPosition().x +" " + player.body.getPosition().y);

		if (Gdx.input.isButtonPressed(Input.Buttons.LEFT)  )
			{
				System.out.println("EFregrh");
				player.body.setTransform((float) Gdx.input.getX()/PPM/2 ,(float) (Gdx.graphics.getHeight() - Gdx.input.getY())/PPM/2,0);
			}
			if(Gdx.input.getPressure() == 0)
			{
					hold=false;
					pausePhysics = false;
					player.body.setLinearVelocity( ((mouseOrigin.x - Gdx.input.getX()) /8 ) , (mouseOrigin.y - (Gdx.graphics.getHeight() - Gdx.input.getY()))/4);
			}
	}



	public boolean includes(Bird player,Vector2 mousePoint ) {
			if (mousePoint.x > player.body.getPosition().x*PPM - (player.width) && mousePoint.x < player.body.getPosition().x*PPM + (player.width) &&
			mousePoint.y > player.body.getPosition().y*PPM - (player.height)  && mousePoint.y < player.body.getPosition().y*PPM + (player.height))
					return true;
			else
					return false;
	}

	@Override
	public void show() {
		Box2D.init();
		world = new World(new Vector2(0, -10), false);
		dDebugRenderer = new Box2DDebugRenderer();
		camera = new OrthographicCamera(20,10);
		//camera.setToOrtho(false, (float) Gdx.graphics.getWidth() / 2, (float) Gdx.graphics.getHeight() / 2);
		pausePhysics = true;
		hold = false;

		NumOfObjects = 10;
		batch = new SpriteBatch();
		batch.setProjectionMatrix(camera.combined);
		img = new Texture("Pig.png");
		Wood_texture = new Texture("Wood1.png");
		background = new Texture("background.png");
		Birds = new Texture("red.png");
		Sling=new Texture("slingshot.png");
		Sling2=new Texture("slingpart.png");
		test2 = new Sprite(Birds);
		test = new Sprite(img);
		test1 = new Sprite(background);
		SSling=new Sprite(Sling);
		SSling2=new Sprite(Sling2);
		
		Wood1Sprite= new Sprite(Wood_texture);
		test2.setSize(50,50);
		Wood1Sprite.setSize(10/PPM , 30/PPM);

		player = new Bird(world, 50, 100, 10, 10, false , test2);
		player.body.setUserData(test2);
		enemies = new Pig[5];
		levelObjects = new Obstacle[NumOfObjects];

		for ( int i = 0 ; i < NumOfObjects ; i++){
			levelObjects[i] = new Obstacle(world,190 , 75+ i*40,  5,20 , false , Wood1Sprite);
		}

		for (int i = 0 ; i < 5 ; i++) {
			enemies[i] = new Pig(world,250 , 75+ i*40,  10,10 , false , Wood1Sprite);
		}


		bedRock = new Obstacle( world ,Gdx.graphics.getWidth() / 2, 55, 1000, 1, true , test1);
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}
}
	