/**
 *
 */
package com.bycc.dto.caseScore;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.bycc.entity.*;
import org.smartframework.utils.helper.DateHelper;

/**
 * @author gaoningbo
 * @description
 * @date 2017年4月24日
 */
public class CaseScoreDto {

    private Integer id;
    //案件ID
    private Integer caseId;
    //案件名称
    private String caseName;
    //得分
    private BigDecimal totalScore;
    //备注
    private String note;
    //更新时间
    private String updateDate;
    // 积分项
    private List<CaseScoreItemDto> itemDtos;

    public static CaseScoreDto toDto(CaseScore score) {
        CaseScoreDto dto = new CaseScoreDto();
        dto.setId(score.getId());
        dto.setCaseId(score.getCaze() != null ? score.getCaze().getId() : null);
        dto.setCaseName(score.getCaze() != null ? score.getCaze().getCaseName() : "");
        dto.setTotalScore(score.getTotalScore());
        dto.setUpdateDate(DateHelper.formatDateToString(score.getUpdateDate(), "yyyy-MM-dd"));

        List<CaseScoreItemDto> itemDtos = new ArrayList<>();
        for (CaseScoreItem item : score.getCaseScoreItems()) {
            itemDtos.add(CaseScoreItemDto.toDto(item));
        }
        dto.setItemDtos(itemDtos);

        return dto;
    }

    public static CaseScoreDto toDto(Case caze, List<BdmEvaluation> evals) {
        CaseScoreDto dto = new CaseScoreDto();
        dto.setCaseId(caze.getId());
        dto.setCaseName(caze.getCaseName());

        List<CaseScoreItemDto> itemDtos = new ArrayList<>();
        if (evals == null) {
        } else {
            for (BdmEvaluation eval : evals) {
                itemDtos.add(CaseScoreItemDto.toDto(eval));
            }
        }

        dto.setItemDtos(itemDtos);

        return dto;
    }

    public CaseScore toEntity() {
        CaseScore score = new CaseScore();
        score.setInsertDate(new Date());
        return toEntity(score);
    }

    public CaseScore toEntity(CaseScore score) {
        BigDecimal totalScore = BigDecimal.ZERO;
        for (CaseScoreItemDto itemDto : this.itemDtos) {
            totalScore = totalScore.add(itemDto.getScore() != null ? itemDto.getScore() : BigDecimal.ZERO);
        }
        score.setTotalScore(totalScore);
        score.setNote(this.note);
        score.setUpdateDate(new Date());
        return score;
    }

    public String getCaseName() {
        return caseName;
    }

    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    public List<CaseScoreItemDto> getItemDtos() {
        return itemDtos;
    }

    public void setItemDtos(List<CaseScoreItemDto> itemDtos) {
        this.itemDtos = itemDtos;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCaseId() {
        return caseId;
    }

    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
    }

    public BigDecimal getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(BigDecimal totalScore) {
        this.totalScore = totalScore;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

}
