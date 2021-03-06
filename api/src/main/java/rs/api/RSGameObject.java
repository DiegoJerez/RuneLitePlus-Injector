package rs.api;

import api.GameObject;
import net.runelite.mapping.Import;

public interface RSGameObject extends GameObject
{
	@Import("entity")
	RSEntity getRenderable();

	@Import("plane")
	int getPlane();

	@Import("startX")
	int getRelativeX();

	@Import("startY")
	int getRelativeY();

	@Import("endX")
	int getOffsetX();

	@Import("endY")
	int getOffsetY();

	@Import("centerX")
	@Override
	int getX();

	@Import("centerY")
	@Override
	int getY();

	@Import("height")
	int getHeight();

	@Import("orientation")
	int getRsOrientation();

	@Import("tag")
	@Override
	long getHash();

	@Import("flags")
	int getFlags();
}
