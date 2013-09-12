package com.itv.horizontalscrollview;


public class SimpleDynamics extends Dynamics {

	private float mFrictionFactor;
	private float mSnapToFactor;

	public SimpleDynamics(final float frictionFactor, final float snapToFactor) {
		mFrictionFactor = frictionFactor;
		mSnapToFactor = snapToFactor;
	}
	
	@Override
	protected void onUpdate(final int dt) {
		float distanceToLimit = getDistanceToLimit();
		mVelocity += distanceToLimit * mSnapToFactor;
		if(distanceToLimit != 0) mVelocity /= 1.35;
		mPosition += mVelocity * dt / 1000;
		mVelocity *= mFrictionFactor;
		
	}
}
