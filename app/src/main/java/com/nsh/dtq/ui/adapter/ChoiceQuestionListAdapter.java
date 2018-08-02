package com.nsh.dtq.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.nsh.dtq.R;
import com.nsh.dtq.entity.ChoiceQuestion;

import java.util.List;

/**
 * Created by licong on 2018/8/2.
 */

public class ChoiceQuestionListAdapter extends BaseAdapter{

    private List<ChoiceQuestion> mDataList;
    private LayoutInflater mLif;

    public ChoiceQuestionListAdapter(Context context, List<ChoiceQuestion> list){
        mDataList = list;
        mLif = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return mDataList == null ? 0 : mDataList.size();
    }

    @Override
    public Object getItem(int position) {
        return mDataList == null ? null : mDataList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder vh;
        if (convertView == null){
            vh = new ViewHolder();
            convertView = mLif.inflate(R.layout.item_choice_question, null);
            vh.tvQuestion = convertView.findViewById(R.id.tv_choice_question);
            vh.tvAnswerA = convertView.findViewById(R.id.tv_choice_answer_a);
            vh.tvAnswerB = convertView.findViewById(R.id.tv_choice_answer_b);
            vh.tvAnswerC = convertView.findViewById(R.id.tv_choice_answer_c);
            vh.tvAnswerD = convertView.findViewById(R.id.tv_choice_answer_d);
            convertView.setTag(vh);
        }else {
            vh = (ViewHolder) convertView.getTag();
        }
        vh.tvQuestion.setText(mDataList.get(position).getQuestion());
        vh.tvAnswerA.setText("A." + mDataList.get(position).getAnswerA());
        vh.tvAnswerB.setText("B." + mDataList.get(position).getAnswerB());
        vh.tvAnswerC.setText("C." + mDataList.get(position).getAnswerC());
        vh.tvAnswerD.setText("D." + mDataList.get(position).getAnswerD());
        return convertView;
    }

    class ViewHolder{
        TextView tvQuestion;
        TextView tvAnswerA;
        TextView tvAnswerB;
        TextView tvAnswerC;
        TextView tvAnswerD;
    }
}
