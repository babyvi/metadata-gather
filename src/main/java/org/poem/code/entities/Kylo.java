/*
 * This file is generated by jOOQ.
 */
package org.poem.code.entities;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;
import org.poem.code.entities.tables.DsgGatherDb;
import org.poem.code.entities.tables.DsgGatherInfo;
import org.poem.code.entities.tables.DsgGatherStatistics;
import org.poem.code.entities.tables.DsgGatherTable;
import org.poem.code.entities.tables.DsgGatherTableFields;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Kylo extends SchemaImpl {

    private static final long serialVersionUID = 703595012;

    /**
     * The reference instance of <code>kylo</code>
     */
    public static final Kylo KYLO = new Kylo();

    /**
     * 采集到库信息
     */
    public final DsgGatherDb DSG_GATHER_DB = org.poem.code.entities.tables.DsgGatherDb.DSG_GATHER_DB;

    /**
     * 元数据采集信息
     */
    public final DsgGatherInfo DSG_GATHER_INFO = org.poem.code.entities.tables.DsgGatherInfo.DSG_GATHER_INFO;

    /**
     * 采集表信息
     */
    public final DsgGatherStatistics DSG_GATHER_STATISTICS = org.poem.code.entities.tables.DsgGatherStatistics.DSG_GATHER_STATISTICS;

    /**
     * 采集表信息
     */
    public final DsgGatherTable DSG_GATHER_TABLE = org.poem.code.entities.tables.DsgGatherTable.DSG_GATHER_TABLE;

    /**
     * 采集表字端信息
     */
    public final DsgGatherTableFields DSG_GATHER_TABLE_FIELDS = org.poem.code.entities.tables.DsgGatherTableFields.DSG_GATHER_TABLE_FIELDS;

    /**
     * No further instances allowed
     */
    private Kylo() {
        super("kylo", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            DsgGatherDb.DSG_GATHER_DB,
            DsgGatherInfo.DSG_GATHER_INFO,
            DsgGatherStatistics.DSG_GATHER_STATISTICS,
            DsgGatherTable.DSG_GATHER_TABLE,
            DsgGatherTableFields.DSG_GATHER_TABLE_FIELDS);
    }
}
