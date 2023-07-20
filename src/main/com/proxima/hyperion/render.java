package src.main.com.proxima.hyperion;

public class render {

    public Vector2 renderPoint(Vector4 vctr) {

        float[] hi = vctr.values;

        float x = vctr.values[1];
        float y = vctr.values[2];
        float z = vctr.values[3];

        float xproj = x/z;
        float yproj = y/z;
        
        return new Vector2(xproj, yproj);

    }

}
