package in.egan.pay.common.bean.outbuilder;

import in.egan.pay.common.bean.PayOutMessage;
/**
 * @author egan
 * @email egzosn@gmail.com
 * @date 2016-6-1 11:40:30
 */
public class XmlBuilder extends BaseBuilder<XmlBuilder, PayXmlOutMessage> {
    private String content;
    private String code;
    public XmlBuilder content(String content) {
        this.content = content;
        return this;
    }

    public XmlBuilder code(String code) {
        this.code = code;
        return this;
    }


    @Override
    public PayXmlOutMessage build() {
        PayXmlOutMessage message = new PayXmlOutMessage();
        setCommon(message);
        message.setContent(content);
        message.setCode(code);
        return message;
    }
}
