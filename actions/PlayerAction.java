package actions;

import player.Player;
import submarine.Room;


public abstract class PlayerAction
{
	public abstract void executeAction( Player player, Room room );
}
