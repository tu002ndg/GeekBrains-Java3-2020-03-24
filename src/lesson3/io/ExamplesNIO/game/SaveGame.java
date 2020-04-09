package lesson3.io.ExamplesNIO.game;

import java.io.Serializable;
import java.util.Arrays;

public class SaveGame implements Serializable {
    private static final long serialVersion = 1L;

    private transient String[] territoriesInfo;
    private String[] resourcesInfo;
    private String[] diplomaticInfo;

    public SaveGame(String[] territoriesInfo, String[] resourcesInfo, String[] diplomaticInfo) {
        this.territoriesInfo = territoriesInfo;
        this.resourcesInfo = resourcesInfo;
        this.diplomaticInfo = diplomaticInfo;
    }

    public String[] getTerritoriesInfo() {
        return territoriesInfo;
    }

    public void setTerritoriesInfo(String[] territoriesInfo) {
        this.territoriesInfo = territoriesInfo;
    }

    public String[] getResourcesInfo() {
        return resourcesInfo;
    }

    public void setResourcesInfo(String[] resourcesInfo) {
        this.resourcesInfo = resourcesInfo;
    }

    public String[] getDiplomaticInfo() {
        return diplomaticInfo;
    }

    public void setDiplomaticInfo(String[] diplomaticInfo) {
        this.diplomaticInfo = diplomaticInfo;
    }

    @Override
    public String toString() {
        return "SaveGame{" +
                "territoriesInfo=" + Arrays.toString(territoriesInfo) +
                ", resourcesInfo=" + Arrays.toString(resourcesInfo) +
                ", diplomaticInfo=" + Arrays.toString(diplomaticInfo) +
                '}';
    }
}
