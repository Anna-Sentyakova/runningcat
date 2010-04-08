package DataBaseContent;

import DataBaseContent.Generic.DataElement;

/**
 *
 * @author partizanka
 */
public class IGenerator extends DataElement {

    private int language_id;
    private String source;

    /**
     * 
     * @param id
     * @param source
     * @param language_id
     */
    public IGenerator(int id, String source, int language_id) {
        this.id = id;
        this.source = source;
        this.language_id = language_id;
    }
}
