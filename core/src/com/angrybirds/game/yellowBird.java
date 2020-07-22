package com.angrybirds.game;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.*;

import static com.angrybirds.game.game.PPM;

public class yellowBird extends Everything {

	public yellowBird(World world, int x, int y, int width, int height, boolean isStatic, Sprite sprite) {
		super(world, x, y, width, height, isStatic, sprite);

		body = create(x, y, width, height, isStatic, world);
	}

	@Override
	protected Body create(int x, int y, int width, int height, boolean isStatic, World world) {
		Body pBody;
		BodyDef def = new BodyDef();
		if (isStatic)
			def.type = BodyDef.BodyType.StaticBody;
		else
			def.type = BodyDef.BodyType.DynamicBody;
		def.position.set(x / PPM, y / PPM);
		def.fixedRotation = false;

		def.angularDamping = 3f;

		pBody = world.createBody(def);
		FixtureDef fixtureDef = new FixtureDef();
		CircleShape shape = new CircleShape();
		shape.setRadius(width / PPM);

		fixtureDef.shape = shape;
		fixtureDef.friction = 1f;
		fixtureDef.density = 1f;

		pBody.createFixture(fixtureDef);
		shape.dispose();
		return pBody;
	}

	public int getCondition() {
		if (health > 50)
			return 0;
		else
			return 1;
	}
}
