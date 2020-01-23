package kata4;

import java.awt.Container;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class HistogramDisplay extends ApplicationFrame{

    private Histogram histo;
    private String histoTitle;
    private final String columValueType;
    private final String columCountType;
    public HistogramDisplay(Histogram Histogram, String title, String columValueType, String columCountType) {
        super("HISTOGRAMA");  //El super manda el titulo q viene en la ventana
        this.histo=Histogram;
        this.histoTitle=title;
        this.columValueType=columValueType;
        this.columCountType=columCountType;
        this.setContentPane(createPanel());
        this.pack();
    }
    public void execute(){
        setVisible(true);
    }
    private JPanel createPanel() {
        ChartPanel charpanePanel = new ChartPanel(createChar((DefaultCategoryDataset) createDataSet()));
        return charpanePanel;
    }

    private JFreeChart createChar(DefaultCategoryDataset dataset) {
        JFreeChart chart = ChartFactory.createBarChart(histoTitle,columValueType ,columCountType, dataset, PlotOrientation.VERTICAL, false, false, rootPaneCheckingEnabled);
        return chart;
    }

    private CategoryDataset createDataSet() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (Object key : histo.keySet()) {
            dataset.addValue(histo.get(key),"", key.toString());
        }
        return dataset;
    }
    
}
