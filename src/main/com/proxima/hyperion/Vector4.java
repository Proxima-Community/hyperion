package src.main.com.proxima.hyperion;

public class Vector4 {
    public float values[];

    public Vector4(float x, float y, float z, float w) {
        this.values[0] = x;
        this.values[1] = y;
        this.values[2] = z;
        this.values[3] = w;
    }

    public Vector4(float x, float y, float z) {
        this.values[0] = x;
        this.values[1] = y;
        this.values[2] = z;
        this.values[3] = 1.0F;
    }
    //Adds two vectors together.
    // @param a First vector to add.
    //@ param b Second vector to add.
    // ! preserves a's w component.
    public static Vector4 vec4Add(Vector4 a, Vector4 b) {
        return new Vector4(a.values[0] + b.values[0], a.values[1] + b.values[1], a.values[2] + b.values[2], a.values[3]);
    }

    //Subtracts two vectors.
    // @param a First vector to add.
    //@ param b Second vector to add.
    // ! preserves a's w component.
    public static Vector4 vec4Sub(Vector4 a, Vector4 b) {
        return new Vector4(a.values[0] - b.values[0], a.values[1] - b.values[1], a.values[2] - b.values[2], a.values[3]);
    }

    //Multiplies two vectors.
    // @param a First vector to add.
    //@ param b Second vector to add.
    // ! preserves a's w component.
    public static Vector4 vec4Mult(Vector4 a, Vector4 b) {
        return new Vector4(a.values[0] * b.values[0], a.values[1] * b.values[1], a.values[2] * b.values[2], a.values[3]);
    }

    //Divides two vectors.
    // @param a First vector to add.
    // @param b Second vector to add.
    // ! preserves a's w component.
    public static Vector4 vec4Div(Vector4 a, Vector4 b) {
        return new Vector4(a.values[0] * b.values[0], a.values[1] * b.values[1], a.values[2] * b.values[2], a.values[3]);
    }
    // Adds a vector and a scalar.
    // @param a Vector to add.
    // @ param b The scalar to add by.
    public static Vector4 vec4AddScalar(Vector4 a, float b) {
        return new Vector4(a.values[0] + b, a.values[1] + b, a.values[2] + b, a.values[3]);
    }

}
