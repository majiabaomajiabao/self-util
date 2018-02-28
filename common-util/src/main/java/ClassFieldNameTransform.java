import com.alibaba.dubbo.common.utils.StringUtils;

import java.lang.reflect.Field;

/**
 * @author majiabao on 2018/2/28.
 */
public class ClassFieldNameTransform {
    public static void main(String[] args) {
        transfrom0(SampleItemDongDBView.class);
    }

    public static void transfrom(Class<?> source) {
        //todo 以后完善吧，先直接将属性打印
        //最好优化为直接生成一个类
        Field[] fields = source.getDeclaredFields();
        String modifier = "private ";
        for (Field field : fields) {
            System.out.println(modifier + field.getType().getSimpleName() + " " + StringUtils.camelToSplitName(field.getName(), "_") + ";");
        }
    }

    public static void transfrom0(Class<?> source) {
        //todo 以后完善吧，先直接将属性打印
        //最好优化为直接生成一个类
        Field[] fields = source.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName()+",");
        }
    }
}
