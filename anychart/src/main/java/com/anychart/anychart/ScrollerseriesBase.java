package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Base class for all stock scroller series.
 */
public class ScrollerseriesBase extends VisualBaseWithBounds {

    public ScrollerseriesBase() {
        js.setLength(0);
        js.append("var scrollerseriesBase").append(++variableIndex).append(" = anychart.core.stock.scrollerSeries.base();");
        jsBase = "scrollerseriesBase" + variableIndex;
    }

    protected ScrollerseriesBase(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected ScrollerseriesBase(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private TableMapping getData;

    /**
     * Gets data for the scroller series.
     */
    public TableMapping getData() {
        if (getData == null)
            getData = new TableMapping(jsBase + ".data()");

        return getData;
    }

    private TableMapping data;
    private DataTable data1;
    private String data2;
    private String data3;
    private String mappingSettings;
    private String csvSettings;

    /**
     * Sets data for the scroller series.
     */
    public ScrollerseriesBase setData(TableMapping data, String mappingSettings, String csvSettings) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            
            this.data = data;
            this.mappingSettings = mappingSettings;
            this.csvSettings = csvSettings;
        } else {
            this.data = data;
            this.mappingSettings = mappingSettings;
            this.csvSettings = csvSettings;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(data.generateJs());
            js.append(String.format(Locale.US, ".data(%s, %s, %s)", ((data != null) ? data.getJsBase() : "null"), wrapQuotes(mappingSettings), wrapQuotes(csvSettings)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".data(%s, %s, %s);", ((data != null) ? data.getJsBase() : "null"), wrapQuotes(mappingSettings), wrapQuotes(csvSettings)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Sets data for the scroller series.
     */
    public ScrollerseriesBase setData(DataTable data1, String mappingSettings, String csvSettings) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            
            this.data1 = data1;
            this.mappingSettings = mappingSettings;
            this.csvSettings = csvSettings;
        } else {
            this.data1 = data1;
            this.mappingSettings = mappingSettings;
            this.csvSettings = csvSettings;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(data1.generateJs());
            js.append(String.format(Locale.US, ".data(%s, %s, %s)", ((data1 != null) ? data1.getJsBase() : "null"), wrapQuotes(mappingSettings), wrapQuotes(csvSettings)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".data(%s, %s, %s);", ((data1 != null) ? data1.getJsBase() : "null"), wrapQuotes(mappingSettings), wrapQuotes(csvSettings)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Sets data for the scroller series.
     */
    public ScrollerseriesBase setData(String data2, String mappingSettings, String csvSettings) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            
            this.data2 = data2;
            this.mappingSettings = mappingSettings;
            this.csvSettings = csvSettings;
        } else {
            this.data2 = data2;
            this.mappingSettings = mappingSettings;
            this.csvSettings = csvSettings;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".data(%s, %s, %s)", wrapQuotes(data2), wrapQuotes(mappingSettings), wrapQuotes(csvSettings)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".data(%s, %s, %s);", wrapQuotes(data2), wrapQuotes(mappingSettings), wrapQuotes(csvSettings)));
                js.setLength(0);
            }
        }
        return this;
    }

    private UiLabelsFactory getLabels;

    /**
     * Getter for chart labels.
     */
    public UiLabelsFactory getLabels() {
        if (getLabels == null)
            getLabels = new UiLabelsFactory(jsBase + ".labels()");

        return getLabels;
    }

    private String labels;
    private Boolean labels1;

    /**
     * Setter for chart labels.
     */
    public ScrollerseriesBase setLabels(String labels) {
        if (jsBase == null) {
            this.labels = null;
            this.labels1 = null;
            
            this.labels = labels;
        } else {
            this.labels = labels;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".labels(%s)", wrapQuotes(labels)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".labels(%s);", wrapQuotes(labels)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for chart labels.
     */
    public ScrollerseriesBase setLabels(Boolean labels1) {
        if (jsBase == null) {
            this.labels = null;
            this.labels1 = null;
            
            this.labels1 = labels1;
        } else {
            this.labels1 = labels1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".labels(%b)", labels1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".labels(%b);", labels1));
                js.setLength(0);
            }
        }
        return this;
    }

    private UiLabelsFactory getMaxLabels;

    /**
     * Getter for maximum labels.
     */
    public UiLabelsFactory getMaxLabels() {
        if (getMaxLabels == null)
            getMaxLabels = new UiLabelsFactory(jsBase + ".maxLabels()");

        return getMaxLabels;
    }

    private String settings;
    private Boolean settings1;
    private List<StockSeriesBase> setMaxLabels = new ArrayList<>();

    /**
     * Setter for maximum labels.
     */
    public StockSeriesBase setMaxLabels(String settings) {
        if (jsBase == null) {
            this.settings = null;
            this.settings1 = null;
            
            this.settings = settings;
        } else {
            this.settings = settings;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setMaxLabels" + ++variableIndex + " = " + jsBase + ".maxLabels(%s);", wrapQuotes(settings)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".maxLabels(%s);", wrapQuotes(settings)));
                js.setLength(0);
            }
        }
        StockSeriesBase item = new StockSeriesBase("setMaxLabels" + variableIndex);
        setMaxLabels.add(item);
        return item;
    }
    private String generateJSsetMaxLabels() {
        if (!setMaxLabels.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StockSeriesBase item : setMaxLabels) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StockSeriesBase> setMaxLabels1 = new ArrayList<>();

    /**
     * Setter for maximum labels.
     */
    public StockSeriesBase setMaxLabels(Boolean settings1) {
        if (jsBase == null) {
            this.settings = null;
            this.settings1 = null;
            
            this.settings1 = settings1;
        } else {
            this.settings1 = settings1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setMaxLabels1" + ++variableIndex + " = " + jsBase + ".maxLabels(%b);", settings1));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".maxLabels(%b);", settings1));
                js.setLength(0);
            }
        }
        StockSeriesBase item = new StockSeriesBase("setMaxLabels1" + variableIndex);
        setMaxLabels1.add(item);
        return item;
    }
    private String generateJSsetMaxLabels1() {
        if (!setMaxLabels1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StockSeriesBase item : setMaxLabels1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Number maxPointWidth;
    private String maxPointWidth1;

    /**
     * Setter for the maximum point width.
     */
    public ScrollerseriesBase setMaxPointWidth(Number maxPointWidth) {
        if (jsBase == null) {
            this.maxPointWidth = null;
            this.maxPointWidth1 = null;
            
            this.maxPointWidth = maxPointWidth;
        } else {
            this.maxPointWidth = maxPointWidth;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".maxPointWidth(%s)", maxPointWidth));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".maxPointWidth(%s);", maxPointWidth));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the maximum point width.
     */
    public ScrollerseriesBase setMaxPointWidth(String maxPointWidth1) {
        if (jsBase == null) {
            this.maxPointWidth = null;
            this.maxPointWidth1 = null;
            
            this.maxPointWidth1 = maxPointWidth1;
        } else {
            this.maxPointWidth1 = maxPointWidth1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".maxPointWidth(%s)", wrapQuotes(maxPointWidth1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".maxPointWidth(%s);", wrapQuotes(maxPointWidth1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private UiLabelsFactory getMinLabels;

    /**
     * Getter for minimum labels.
     */
    public UiLabelsFactory getMinLabels() {
        if (getMinLabels == null)
            getMinLabels = new UiLabelsFactory(jsBase + ".minLabels()");

        return getMinLabels;
    }

    private String settings2;
    private Boolean settings3;

    /**
     * Setter for minimum labels.
     */
    public ScrollerseriesBase setMinLabels(String settings2) {
        if (jsBase == null) {
            this.settings = null;
            this.settings1 = null;
            this.settings2 = null;
            this.settings3 = null;
            
            this.settings2 = settings2;
        } else {
            this.settings2 = settings2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".minLabels(%s)", wrapQuotes(settings2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".minLabels(%s);", wrapQuotes(settings2)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for minimum labels.
     */
    public ScrollerseriesBase setMinLabels(Boolean settings3) {
        if (jsBase == null) {
            this.settings = null;
            this.settings1 = null;
            this.settings2 = null;
            this.settings3 = null;
            
            this.settings3 = settings3;
        } else {
            this.settings3 = settings3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".minLabels(%b)", settings3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".minLabels(%b);", settings3));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number minPointLength;
    private String minPointLength1;

    /**
     * Setter for the minimum point length.
     */
    public ScrollerseriesBase setMinPointLength(Number minPointLength) {
        if (jsBase == null) {
            this.minPointLength = null;
            this.minPointLength1 = null;
            
            this.minPointLength = minPointLength;
        } else {
            this.minPointLength = minPointLength;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".minPointLength(%s)", minPointLength));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".minPointLength(%s);", minPointLength));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the minimum point length.
     */
    public ScrollerseriesBase setMinPointLength(String minPointLength1) {
        if (jsBase == null) {
            this.minPointLength = null;
            this.minPointLength1 = null;
            
            this.minPointLength1 = minPointLength1;
        } else {
            this.minPointLength1 = minPointLength1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".minPointLength(%s)", wrapQuotes(minPointLength1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".minPointLength(%s);", wrapQuotes(minPointLength1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private StateSettings getNormal;

    /**
     * Getter for normal state settings.
     */
    public StateSettings getNormal() {
        if (getNormal == null)
            getNormal = new StateSettings(jsBase + ".normal()");

        return getNormal;
    }

    private String normal;

    /**
     * Setter for normal state settings.
     */
    public ScrollerseriesBase setNormal(String normal) {
        if (jsBase == null) {
            this.normal = normal;
        } else {
            this.normal = normal;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".normal(%s)", wrapQuotes(normal)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".normal(%s);", wrapQuotes(normal)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number pointWidth;
    private String pointWidth1;

    /**
     * Setter for the point width settings.
     */
    public ScrollerseriesBase setPointWidth(Number pointWidth) {
        if (jsBase == null) {
            this.pointWidth = null;
            this.pointWidth1 = null;
            
            this.pointWidth = pointWidth;
        } else {
            this.pointWidth = pointWidth;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".pointWidth(%s)", pointWidth));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".pointWidth(%s);", pointWidth));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the point width settings.
     */
    public ScrollerseriesBase setPointWidth(String pointWidth1) {
        if (jsBase == null) {
            this.pointWidth = null;
            this.pointWidth1 = null;
            
            this.pointWidth1 = pointWidth1;
        } else {
            this.pointWidth1 = pointWidth1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".pointWidth(%s)", wrapQuotes(pointWidth1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".pointWidth(%s);", wrapQuotes(pointWidth1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private RenderingSettings getRendering;

    /**
     * Getter for the series rendering.
     */
    public RenderingSettings getRendering() {
        if (getRendering == null)
            getRendering = new RenderingSettings(jsBase + ".rendering()");

        return getRendering;
    }

    private String rendering;

    /**
     * Setter for the series rendering settings.
     */
    public ScrollerseriesBase setRendering(String rendering) {
        if (jsBase == null) {
            this.rendering = rendering;
        } else {
            this.rendering = rendering;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".rendering(%s)", wrapQuotes(rendering)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rendering(%s);", wrapQuotes(rendering)));
                js.setLength(0);
            }
        }
        return this;
    }

    private StateSettings getSelected;

    /**
     * Getter for selected state settings.
     */
    public StateSettings getSelected() {
        if (getSelected == null)
            getSelected = new StateSettings(jsBase + ".selected()");

        return getSelected;
    }

    private String selected;

    /**
     * Setter for selected state settings.
     */
    public ScrollerseriesBase setSelected(String selected) {
        if (jsBase == null) {
            this.selected = selected;
        } else {
            this.selected = selected;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".selected(%s)", wrapQuotes(selected)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selected(%s);", wrapQuotes(selected)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String seriesType;

    /**
     * Setter for switching of the series type.
     */
    public ScrollerseriesBase setSeriesType(String seriesType) {
        if (jsBase == null) {
            this.seriesType = seriesType;
        } else {
            this.seriesType = seriesType;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".seriesType(%s)", wrapQuotes(seriesType)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".seriesType(%s);", wrapQuotes(seriesType)));
                js.setLength(0);
            }
        }
        return this;
    }

    private ScatterBase getYScale;

    /**
     * Getter for the current Y-scale.
     */
    public ScatterBase getYScale() {
        if (getYScale == null)
            getYScale = new ScatterBase(jsBase + ".yScale()");

        return getYScale;
    }

    private ScatterBase yScale;
    private String yScale1;
    private ScaleTypes yScale2;
    private String yScale3;

    /**
     * Setter for the Y-scale.
     */
    public ScrollerseriesBase setYScale(ScatterBase yScale) {
        if (jsBase == null) {
            this.yScale = null;
            this.yScale1 = null;
            this.yScale2 = null;
            this.yScale3 = null;
            
            this.yScale = yScale;
        } else {
            this.yScale = yScale;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(yScale.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".yScale(%s);",  ((yScale != null) ? yScale.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".yScale(%s);", ((yScale != null) ? yScale.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the Y-scale.
     */
    public ScrollerseriesBase setYScale(String yScale1) {
        if (jsBase == null) {
            this.yScale = null;
            this.yScale1 = null;
            this.yScale2 = null;
            this.yScale3 = null;
            
            this.yScale1 = yScale1;
        } else {
            this.yScale1 = yScale1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".yScale(%s)", wrapQuotes(yScale1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".yScale(%s);", wrapQuotes(yScale1)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the Y-scale.
     */
    public ScrollerseriesBase setYScale(ScaleTypes yScale2) {
        if (jsBase == null) {
            this.yScale = null;
            this.yScale1 = null;
            this.yScale2 = null;
            this.yScale3 = null;
            
            this.yScale2 = yScale2;
        } else {
            this.yScale2 = yScale2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".yScale(%s)", ((yScale2 != null) ? yScale2.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".yScale(%s);", ((yScale2 != null) ? yScale2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSgetData() {
        if (getData != null) {
            return getData.generateJs();
        }
        return "";
    }

    private String generateJSgetLabels() {
        if (getLabels != null) {
            return getLabels.generateJs();
        }
        return "";
    }

    private String generateJSgetMaxLabels() {
        if (getMaxLabels != null) {
            return getMaxLabels.generateJs();
        }
        return "";
    }

    private String generateJSgetMinLabels() {
        if (getMinLabels != null) {
            return getMinLabels.generateJs();
        }
        return "";
    }

    private String generateJSgetNormal() {
        if (getNormal != null) {
            return getNormal.generateJs();
        }
        return "";
    }

    private String generateJSgetRendering() {
        if (getRendering != null) {
            return getRendering.generateJs();
        }
        return "";
    }

    private String generateJSgetSelected() {
        if (getSelected != null) {
            return getSelected.generateJs();
        }
        return "";
    }

    private String generateJSgetYScale() {
        if (getYScale != null) {
            return getYScale.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetData());
        jsGetters.append(generateJSgetLabels());
        jsGetters.append(generateJSgetMaxLabels());
        jsGetters.append(generateJSgetMinLabels());
        jsGetters.append(generateJSgetNormal());
        jsGetters.append(generateJSgetRendering());
        jsGetters.append(generateJSgetSelected());
        jsGetters.append(generateJSgetYScale());

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(generateJsGetters());

        js.append(generateJSsetMaxLabels());
        js.append(generateJSsetMaxLabels1());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}