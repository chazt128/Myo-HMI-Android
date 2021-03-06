package example;

import java.util.Arrays;
import java.util.ArrayList;

public class DataVector {
    private String TAG = "DataVector";
    private boolean imuOrEmg;
    private int flag = -1;
    private int length;
    private ArrayList<Number> data;
    private long timestamp;

    public DataVector(boolean imuOrEmg, int flag, int length, ArrayList<Number> data, long timestamp) {
        this.imuOrEmg = imuOrEmg;
        this.flag = flag;
        this.length = length;
        this.timestamp = timestamp;
        this.data = new ArrayList<>();
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                this.data.add(i, data.get(i));
            }
        }
    }

    public DataVector(int flag, int length, ArrayList<Number> data) {
        this.imuOrEmg = false;
        this.flag = flag;
        this.length = length;
        this.timestamp = System.currentTimeMillis();
        this.data = new ArrayList<>();
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                this.data.add(i, data.get(i));
            }
        }
    }

    public Number getValue(int index) {
        return this.data.get(index);
    }

    public boolean getImOrEmg() {
        return this.imuOrEmg;
    }

    public int getFlag() {
        return this.flag;
    }

    public int getLength() {
        return this.length;
    }

    public ArrayList<Number> getVectorData() {
        return this.data;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(long ts) {
        this.timestamp = ts;
    }

    public void setFlag(int inFlag) {
        this.flag = inFlag;
    }

    public void printDataVector(String tag) {
        String s = String.valueOf(timestamp);
//        if(imuOrEmg)
//            Log.d(TAG, "EMG: " + Arrays.toString(this.data.toArray()) + " - " + s);
//        else
//            Log.d(TAG, " : " + Arrays.toString(this.data.toArray()) + " - " + s);
//        Log.d(tag, Arrays.toString(this.data.toArray()) + " - " + s);
    }
}