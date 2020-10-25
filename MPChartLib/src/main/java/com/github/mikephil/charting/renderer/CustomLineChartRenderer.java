package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;

import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.formatter.IValueFormatter;

import com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider;
import com.github.mikephil.charting.utils.ViewPortHandler;

class CustomLineChartRenderer extends LineChartRenderer {

    public CustomLineChartRenderer(LineDataProvider chart, ChartAnimator animator, ViewPortHandler viewPortHandler) {
        super( chart, animator, viewPortHandler);
    }

    @Override
    public void drawValue(Canvas canvas, IValueFormatter formatter, float value, Entry entry, int dataSetIndex, float x, float y, int color) {
        mValuePaint.setColor(color);

        canvas.save();
        canvas.rotate(-60, x, y);

        canvas.drawText(formatter.getFormattedValue(value, entry, dataSetIndex, mViewPortHandler), x, y, mValuePaint);
        canvas.restore();


    }


}