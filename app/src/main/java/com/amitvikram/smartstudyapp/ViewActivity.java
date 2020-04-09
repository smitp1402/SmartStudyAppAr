package com.amitvikram.smartstudyapp;

import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.google.ar.core.Anchor;
import com.google.ar.sceneform.AnchorNode;
import com.google.ar.sceneform.rendering.ModelRenderable;
import com.google.ar.sceneform.ux.ArFragment;
import com.google.ar.sceneform.ux.TransformableNode;

public class ViewActivity extends AppCompatActivity {
    //creating ar fragment
    private ArFragment arFragment;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        intent = getIntent();
        int planetNo = intent.getIntExtra("planetNo", 1);
//referencing ar fragment
        arFragment = (ArFragment) getSupportFragmentManager().findFragmentById(R.id.arfragment);

        switch(planetNo) {
            case 1:
                //setting ar listener on that fragment so that if user click fragment model will display.
                arFragment.setOnTapArPlaneListener((hitResult, plane, motionEvent) -> { // this method calls when user taps on ar fragment
                    //Anchor describe fixed location and orientation in the real world used for overlay nd render 3d model
                    //anchor creationadb
                    Anchor anchor = hitResult.createAnchor(); //used to render 3d model it is fixed
                    ModelRenderable.builder() // building model
                            .setSource(this, Uri.parse("Earth.sfb")).build()
                            .thenAccept(modelRenderable -> addModelToScene(anchor, modelRenderable)).exceptionally(throwable -> {// add model to the scene
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setMessage(throwable.getMessage()).show();
                        return null;
                    });
                });
                //txtDesc.setText(R.string.earth_txt);
                break;
            case 2:
                //setting ar listener on that fragment so that if user click fragment model will display.
                arFragment.setOnTapArPlaneListener((hitResult, plane, motionEvent) -> { // this method calls when user taps on ar fragment
                    //Anchor describe fixed location and orientation in the real world used for overlay nd render 3d model
                    //anchor creationadb
                    Anchor anchor = hitResult.createAnchor(); //used to render 3d model it is fixed
                    ModelRenderable.builder() // building model
                            .setSource(this, Uri.parse("Jupiter.sfb")).build()
                            .thenAccept(modelRenderable -> addModelToScene(anchor, modelRenderable)).exceptionally(throwable -> {// add model to the scene
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setMessage(throwable.getMessage()).show();
                        return null;
                    });
                });
                //txtDesc.setText(R.string.jupiter_txt);
                break;
            case 3:
                //setting ar listener on that fragment so that if user click fragment model will display.
                arFragment.setOnTapArPlaneListener((hitResult, plane, motionEvent) -> { // this method calls when user taps on ar fragment
                    //Anchor describe fixed location and orientation in the real world used for overlay nd render 3d model
                    //anchor creationadb
                    Anchor anchor = hitResult.createAnchor(); //used to render 3d model it is fixed
                    ModelRenderable.builder() // building model
                            .setSource(this, Uri.parse("Mars.sfb")).build()
                            .thenAccept(modelRenderable -> addModelToScene(anchor, modelRenderable)).exceptionally(throwable -> {// add model to the scene
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setMessage(throwable.getMessage()).show();
                        return null;
                    });
                });
                //txtDesc.setText(R.string.mars_txt);
                break;
            case 4:
                //setting ar listener on that fragment so that if user click fragment model will display.
                arFragment.setOnTapArPlaneListener((hitResult, plane, motionEvent) -> { // this method calls when user taps on ar fragment
                    //Anchor describe fixed location and orientation in the real world used for overlay nd render 3d model
                    //anchor creationadb
                    Anchor anchor = hitResult.createAnchor(); //used to render 3d model it is fixed
                    ModelRenderable.builder() // building model
                            .setSource(this, Uri.parse("Earth.sfb")).build()
                            .thenAccept(modelRenderable -> addModelToScene(anchor, modelRenderable)).exceptionally(throwable -> {// add model to the scene
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setMessage(throwable.getMessage()).show();
                        return null;
                    });
                });
                //txtDesc.setText(R.string.pluto_txt);
                break;
            case 5:
                //setting ar listener on that fragment so that if user click fragment model will display.
                arFragment.setOnTapArPlaneListener((hitResult, plane, motionEvent) -> { // this method calls when user taps on ar fragment
                    //Anchor describe fixed location and orientation in the real world used for overlay nd render 3d model
                    //anchor creationadb
                    Anchor anchor = hitResult.createAnchor(); //used to render 3d model it is fixed
                    ModelRenderable.builder() // building model
                            .setSource(this, Uri.parse("Venus.sfb")).build()
                            .thenAccept(modelRenderable -> addModelToScene(anchor, modelRenderable)).exceptionally(throwable -> {// add model to the scene
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setMessage(throwable.getMessage()).show();
                        return null;
                    });
                });
                //txtDesc.setText(R.string.venus_txt);
                break;
            case 6:
                //setting ar listener on that fragment so that if user click fragment model will display.
                arFragment.setOnTapArPlaneListener((hitResult, plane, motionEvent) -> { // this method calls when user taps on ar fragment
                    //Anchor describe fixed location and orientation in the real world used for overlay nd render 3d model
                    //anchor creationadb
                    Anchor anchor = hitResult.createAnchor(); //used to render 3d model it is fixed
                    ModelRenderable.builder() // building model
                            .setSource(this, Uri.parse("Saturn.sfb")).build()
                            .thenAccept(modelRenderable -> addModelToScene(anchor, modelRenderable)).exceptionally(throwable -> {// add model to the scene
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setMessage(throwable.getMessage()).show();
                        return null;
                    });
                });
                //txtDesc.setText(R.string.satrun_txt);
                break;
            case 7:
                //setting ar listener on that fragment so that if user click fragment model will display.
                arFragment.setOnTapArPlaneListener((hitResult, plane, motionEvent) -> { // this method calls when user taps on ar fragment
                    //Anchor describe fixed location and orientation in the real world used for overlay nd render 3d model
                    //anchor creationadb
                    Anchor anchor = hitResult.createAnchor(); //used to render 3d model it is fixed
                    ModelRenderable.builder() // building model
                            .setSource(this, Uri.parse("Mercury.sfb")).build()
                            .thenAccept(modelRenderable -> addModelToScene(anchor, modelRenderable)).exceptionally(throwable -> {// add model to the scene
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setMessage(throwable.getMessage()).show();
                        return null;
                    });
                });
                //txtDesc.setText(R.string.mercury_txt);
                break;
            case 8:
                //setting ar listener on that fragment so that if user click fragment model will display.
                arFragment.setOnTapArPlaneListener((hitResult, plane, motionEvent) -> { // this method calls when user taps on ar fragment
                    //Anchor describe fixed location and orientation in the real world used for overlay nd render 3d model
                    //anchor creationadb
                    Anchor anchor = hitResult.createAnchor(); //used to render 3d model it is fixed
                    ModelRenderable.builder() // building model
                            .setSource(this, Uri.parse("Neptune.sfb")).build()
                            .thenAccept(modelRenderable -> addModelToScene(anchor, modelRenderable)).exceptionally(throwable -> {// add model to the scene
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setMessage(throwable.getMessage()).show();
                        return null;
                    });
                });
                //txtDesc.setText(R.string.neptune_txt);
                break;
            case 9:
                //setting ar listener on that fragment so that if user click fragment model will display.
                arFragment.setOnTapArPlaneListener((hitResult, plane, motionEvent) -> { // this method calls when user taps on ar fragment
                    //Anchor describe fixed location and orientation in the real world used for overlay nd render 3d model
                    //anchor creationadb
                    Anchor anchor = hitResult.createAnchor(); //used to render 3d model it is fixed
                    ModelRenderable.builder() // building model
                            .setSource(this, Uri.parse("Uranus.sfb")).build()
                            .thenAccept(modelRenderable -> addModelToScene(anchor, modelRenderable)).exceptionally(throwable -> {// add model to the scene
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setMessage(throwable.getMessage()).show();
                        return null;
                    });
                });
                //txtDesc.setText(R.string.uranus_txt);
                break;
        }
    }
    private void addModelToScene(Anchor anchor, ModelRenderable modelRenderable) {
        //anchor node positions ar model in real world space based on anchor
        //anchor node creation
        AnchorNode anchorNode = new AnchorNode(anchor);
        //setting ar node transformable so that user can zoom in or zoom out
        TransformableNode transformableNode = new TransformableNode(arFragment.getTransformationSystem());
        transformableNode.setParent(anchorNode);
        transformableNode.setRenderable(modelRenderable);
        arFragment.getArSceneView().getScene().addChild(anchorNode);
        transformableNode.select();
    }
}
