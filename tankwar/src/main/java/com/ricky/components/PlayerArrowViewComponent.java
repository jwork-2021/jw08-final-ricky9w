package com.ricky.components;

import com.almasb.fxgl.dsl.components.view.ChildViewComponent;

import static com.almasb.fxgl.dsl.FXGL.texture;

public class PlayerArrowViewComponent extends ChildViewComponent {
    
    public PlayerArrowViewComponent() {
        super(3, -30, false);

        var arrow = texture("ui_arrow.png", 32, 32);

        getViewRoot().getChildren().addAll(arrow);
    }
}
