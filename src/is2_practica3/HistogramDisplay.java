package is2_practica3;

import java.awt.Dimension;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

/**
 *
 * @author Goretti
 */
public class HistogramDisplay extends ApplicationFrame {

    public HistogramDisplay() {
        super("HISTOGRAMA");
        setContentPane(CreatePanel());
        pack();
    }

    private ChartPanel CreatePanel() {
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(500, 400));
        return chartPanel;
    }
    
    private JFreeChart createChart (DefaultCategoryDataset dataset) {
        JFreeChart chart = ChartFactory.createBarChart(null,
                "DOMINIO",
                "Nº email",
                dataset,
                PlotOrientation.VERTICAL,
                true, //Sirve para que muestre leyenda en caso de tener mas datos
                true, // Este es pa que al pasar el raton por encim te muestre los datos
                false); //Este es pa entorno web
        return chart;
    }
    
    private DefaultCategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10, "ENE", "gmail.com");
        dataset.addValue(7, "ENE", "ulpgc.com");
        dataset.addValue(10, "ENE", "ull.com");
        dataset.addValue(17, "FEB", "gmail.com");
        dataset.addValue(7, "FEB", "ulpgc.com");
        dataset.addValue(10, "FEB", "ull.com");
        return dataset;
    }
    
    public void execute () {
        setVisible(true);
    }
}
