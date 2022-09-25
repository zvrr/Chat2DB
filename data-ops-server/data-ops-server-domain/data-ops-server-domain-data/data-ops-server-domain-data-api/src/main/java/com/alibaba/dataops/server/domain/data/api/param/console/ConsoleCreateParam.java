package com.alibaba.dataops.server.domain.data.api.param.console;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 控制台创建参数
 *
 * @author Jiaju Zhuang
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString
public class ConsoleCreateParam {
    /**
     * 对应数据库存储的来源id
     */
    @NotNull
    private Long dataSourceId;

    /**
     * 控制台的id ，确保全局唯一
     * 确保不要重复，重复的情况下会弃用以前的连接，并重新创建
     */
    @NotNull
    private Long consoleId;
}