package com.example.bomberm4n.Entities;

import javafx.scene.image.Image;

public class Ballon extends Entity {
    public Ballon(int xUnit, int yUnit, Image img) {
        super(xUnit, yUnit, img);
    }

    @Override
    public void update() {
            x--;
    }
}
