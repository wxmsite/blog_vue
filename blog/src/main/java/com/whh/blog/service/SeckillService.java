package com.whh.blog.service;

import com.whh.blog.Exception.RepeatKillException;
import com.whh.blog.Exception.SeckillCloseException;
import com.whh.blog.Exception.SeckillException;
import com.whh.blog.pojo.Exposer;
import com.whh.blog.pojo.SeckillExecution;

/**
 * author bebetter159
 * date  2018/6/7 22:09
 */
public interface SeckillService {
    Exposer exportSeckillUrl();
    SeckillExecution executeSeckill( int userId, String md5)
            throws SeckillException,RepeatKillException,SeckillCloseException;
}
