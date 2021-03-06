package model.motionless;

import model.enumeration.BlockEffect;
import model.enumeration.Opacity;
import model.enumeration.Permeability;
import model.enumeration.Solidity;
import model.genercis.Position;
import model.other.Random;

public class DarkBlock extends MotionLess{

	public DarkBlock(Position position) {
		super(0, 0, 1, "DarkBlock", Opacity.BLOCKING, Permeability.NONE, BlockEffect.NONE,Solidity.NORMAL,position, 50, 50, 50, 50);
	}

}
