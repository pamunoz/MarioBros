package com.pfariasmunoz.mariobros.sprites;

import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.physics.box2d.World;

/**
 * Created by Pablo Farias on 31-07-16.
 */
public class Brick extends InteractiveTileObject {

    public Brick(World world, TiledMap map, Rectangle bounds) {
        super(world, map, bounds);
    }
}
