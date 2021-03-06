package org.poem.code.api;

import org.poem.code.api.vo.statistics.DsggatherStatisticsVO;

import java.util.List;

/**
 *
 * @author Administrator
 */
public interface DsggatherStatisticsService  {

    /**
     *  保存
     * @param dsggatherStatisticsVO
     */
    void save(DsggatherStatisticsVO dsggatherStatisticsVO);


    /**
     *  查询
     * @return
     */
    List<DsggatherStatisticsVO> query();


    /**
     *
     * @param dsggatherStatisticsVO
     */
    public void saveCurrent(DsggatherStatisticsVO dsggatherStatisticsVO);
}
