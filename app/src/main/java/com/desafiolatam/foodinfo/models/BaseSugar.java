package com.desafiolatam.foodinfo.models;

import com.orm.SugarRecord;

/**
 * Created by Gabriel on 04-11-2017.
 */

public class BaseSugar extends SugarRecord {

    private long server_id;

    public BaseSugar() {
    }

    public long getServer_id() {
        return server_id;
    }

    public void setServer_id(long server_id) {
        this.server_id = server_id;
    }

    public void create(){
        setServer_id(getId());
        setId(null);
        save();
    }

    @Override
    public long save() {
        return super.save();
    }

}
