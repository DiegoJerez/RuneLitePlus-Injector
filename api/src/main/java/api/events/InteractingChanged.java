package api.events;

import api.Actor;
import lombok.Value;

/**
 * An event called when the actor an actor is interacting with changes
 */
@Value
public class InteractingChanged
{
	private final Actor source;

	/**
	 * Target actor, may be null
	 */
	private final Actor target;
}
