/**
 * Copyright (C) 2009 Michael A. MacDonald
 */
package net.thecybershadow.vnc;

import android.widget.ImageView.ScaleType;

/**
 * @author Michael A. MacDonald
 */
class OneToOneScaling extends AbstractScaling {

	/**
	 * @param id
	 * @param scaleType
	 */
	public OneToOneScaling() {
		super(R.id.itemOneToOne,ScaleType.CENTER);
	}

	/* (non-Javadoc)
	 * @see net.thecybershadow.vnc.AbstractScaling#getDefaultHandlerId()
	 */
	@Override
	int getDefaultHandlerId() {
		return R.id.itemInputTouchPanTrackballMouse;
	}

	/* (non-Javadoc)
	 * @see net.thecybershadow.vnc.AbstractScaling#isAbleToPan()
	 */
	@Override
	boolean isAbleToPan() {
		return true;
	}

	/* (non-Javadoc)
	 * @see net.thecybershadow.vnc.AbstractScaling#isValidInputMode(int)
	 */
	@Override
	boolean isValidInputMode(int mode) {
		return mode != R.id.itemInputFitToScreen;
	}

	/* (non-Javadoc)
	 * @see net.thecybershadow.vnc.AbstractScaling#setScaleTypeForActivity(net.thecybershadow.vnc.VncCanvasActivity)
	 */
	@Override
	void setScaleTypeForActivity(VncCanvasActivity activity) {
		super.setScaleTypeForActivity(activity);
		activity.vncCanvas.scrollToAbsolute();
		activity.vncCanvas.pan(0,0);
	}

}
