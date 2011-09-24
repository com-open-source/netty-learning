package com.open.source.handlers;

import org.apache.log4j.Logger;
import org.jboss.netty.channel.*;

/**
 * Created by IntelliJ IDEA.
 * User: PAUL HANSEN
 * Date: 9/23/11
 * Time: 9:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class DiscardServerHandler extends SimpleChannelHandler {
  private final Logger LOG = Logger.getLogger(DiscardServerHandler.class);

  @Override
  public void messageReceived(ChannelHandlerContext ctx, MessageEvent e) throws Exception {
    if (LOG.isDebugEnabled()) {
      LOG.debug("messageReceived");
    }
  }

  @Override
  public void exceptionCaught(ChannelHandlerContext ctx, ExceptionEvent e) throws Exception {
    e.getCause().printStackTrace();

    final Channel channel = e.getChannel();
    channel.close();
  }
}
