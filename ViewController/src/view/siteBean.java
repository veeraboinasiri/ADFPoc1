package view;

import javax.el.ExpressionFactory;

import javax.el.ValueExpression;

import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import oracle.adf.model.BindingContext;

import oracle.adf.model.binding.DCIteratorBinding;

import oracle.adf.share.ADFContext;

import oracle.binding.BindingContainer;

import oracle.jbo.ViewObject;

public class siteBean {
    public siteBean() {
    }
//    public static Object evaluateEL(String el) {
//            FacesContext facesContext = FacesContext.getCurrentInstance();
//            ExpressionFactory ef = facesContext.getApplication().getExpressionFactory();
//            ValueExpression ve = ef.createValueExpression(
//                    facesContext.getELContext(), el, Object.class);
//            return ve.getValue(facesContext.getELContext());
//    }
//    public studyBean getStudyBean() {
//        return (studyBean) evaluateEL("#{pageFlowScope.studyBean}");
//    }
//    
//    public void siteNavigationBtn(ActionEvent actionEvent) {
//        System.out.println("in siteNavigationBtn---"+getStudyBean().getStudyId());
//        
//    }
//    public void filterData() {
//
//        BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
//
//        DCIteratorBinding iter =
//            (DCIteratorBinding) bindings.get("SITEEOView2Iterator");
//
//        ViewObject vo = iter.getViewObject();
//
//        Object studyId =
//            ADFContext.getCurrent().getPageFlowScope().get("studyIdTF");
//
//        vo.setWhereClause("STUDY_ID = :1");
//        vo.setWhereClauseParam(0, studyId);
//
//        vo.executeQuery();
//    }
}
