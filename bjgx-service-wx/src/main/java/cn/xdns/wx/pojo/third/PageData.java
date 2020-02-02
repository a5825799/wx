package cn.xdns.wx.pojo.third;

import com.github.pagehelper.Page;
import lombok.Data;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

@Data
public class PageData<T> implements Serializable {

    private int pageNum;
    private int pageSize;
    private long total;
    private int pages;
    private List<T> list;
    private boolean isFirstPage = false;
    private boolean isLastPage = false;

    public PageData(){}

    public PageData(List<T> list) {
        if (list instanceof Page) {
            Page page = (Page) list;
            this.pageNum = page.getPageNum();
            this.pageSize = page.getPageSize();

            this.pages = page.getPages();
            this.list = page;
            this.total = page.getTotal();
        } else if (list instanceof Collection) {
            this.pageNum = 1;
            this.pageSize = list.size();

            this.pages = 1;
            this.list = list;
            this.total = list.size();
        }
        if (list instanceof Collection) {
            //判断页面边界
            judgePageBoundary();
        }
    }

    private void judgePageBoundary() {
        isFirstPage = pageNum == 1;
        isLastPage = pageNum == pages;
    }

}
