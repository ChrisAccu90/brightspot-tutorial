package content.page;

import com.psddev.cms.view.ViewModel;
import styleguide.content.page.PageFooterView;
import styleguide.content.page.PageHeaderView;
import styleguide.content.page.PageView;
import styleguide.content.page.PageViewFooterField;
import styleguide.content.page.PageViewHeaderField;
import styleguide.content.page.PageViewMainField;

public class PageViewModel extends ViewModel<Page> implements PageView {

    @Override
    public String getTitle() {
        return "Brightspot Tutorial";
    }

    @Override
    public PageViewHeaderField getHeader() {
        return new PageHeaderView.Builder().build();
    }

    @Override
    public PageViewMainField getMain() {
        return createView(PageViewMainField.class, model);
    }

    @Override
    public PageViewFooterField getFooter() {
        return new PageFooterView.Builder().build();
    }
}
