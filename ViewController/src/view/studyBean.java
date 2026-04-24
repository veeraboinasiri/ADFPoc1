package view;

import javax.el.ExpressionFactory;
import javax.el.ValueExpression;

import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import oracle.adf.model.binding.DCBindingContainer;
        import oracle.adf.model.BindingContext;
        import oracle.binding.BindingContainer;
        import oracle.adf.model.binding.DCBindingContainer;
        import oracle.adf.model.binding.DCIteratorBinding;
        import oracle.jbo.ViewObject;
public class studyBean {
    public studyBean() {
    }
   public String studyId;

    public void setStudyId(String studyId) {
        this.studyId = studyId;
    }

    public String getStudyId() {
        return studyId;
    }
    public static Object evaluateEL(String el) {
            FacesContext facesContext = FacesContext.getCurrentInstance();
            ExpressionFactory ef = facesContext.getApplication().getExpressionFactory();
            ValueExpression ve = ef.createValueExpression(
                    facesContext.getELContext(), el, Object.class);
            return ve.getValue(facesContext.getELContext());
    }

    public void studyNavigateBtn(ActionEvent actionEvent) {
//        System.out.println("studyNavigateBtn---" +studyId);
        

        // Get Binding Container
        DCBindingContainer bc = (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();

        // Find Iterator
        DCIteratorBinding iteratorBinding = bc.findIteratorBinding("siteQBVO1Iterator");

        // Get ViewObject
        ViewObject findVO = iteratorBinding.getViewObject();
   
//        findVO.setWhereClause("STUDY_ID = '"+studyId+"'");
        System.out.println("vo query---"+findVO.getQuery());
        
    }

    public void navigate(ActionEvent actionEvent) {
        studyId = (String) evaluateEL("#{pageFlowScope.studyIdTF}");
        System.out.println("navigate---"+studyId);
                

                // Get Binding Container
                DCBindingContainer bc = (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();

                // Find Iterator
                DCIteratorBinding iteratorBinding = bc.findIteratorBinding("siteQBVO1Iterator");

                // Get ViewObject
                ViewObject findVO = iteratorBinding.getViewObject();
           
                findVO.setWhereClause("STUDY_ID = '"+studyId+"'");
                System.out.println("vo query---"+findVO.getQuery());
    }
}
