package io.pivotal.pal.tracker;

import java.util.Map;

public class JdbcTemplate {
    private String s;
    private long id;

    public JdbcTemplate(MysqlDataSource dataSource) {
    }

    public void execute(String delete_from_time_entries) {

    }

    public Map<String, Object> queryForMap(String s, long id) {
        this.s = s;
        this.id = id;
        return null;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
