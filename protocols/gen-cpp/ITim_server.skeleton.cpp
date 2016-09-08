// This autogenerated skeleton file illustrates how to build a server.
// You should copy it to another filename to avoid overwriting it.

#include "ITim.h"
#include <thrift/protocol/TBinaryProtocol.h>
#include <thrift/server/TSimpleServer.h>
#include <thrift/transport/TServerSocket.h>
#include <thrift/transport/TBufferTransports.h>

using namespace ::apache::thrift;
using namespace ::apache::thrift::protocol;
using namespace ::apache::thrift::transport;
using namespace ::apache::thrift::server;

using boost::shared_ptr;

class ITimHandler : virtual public ITimIf {
 public:
  ITimHandler() {
    // Your initialization goes here
  }

  /**
   * 流程开始
   * 
   * @param param
   */
  void timStream(const TimParam& param) {
    // Your implementation goes here
    printf("timStream\n");
  }

  /**
   * tls协议
   */
  void timStarttls() {
    // Your implementation goes here
    printf("timStarttls\n");
  }

  /**
   * 登陆协议
   * 
   * @param tid
   * @param pwd
   */
  void timLogin(const Tid& tid, const std::string& pwd) {
    // Your implementation goes here
    printf("timLogin\n");
  }

  /**
   * 回执信息
   * 
   * @param ab
   */
  void timAck(const TimAckBean& ab) {
    // Your implementation goes here
    printf("timAck\n");
  }

  /**
   * 广播出席协议或接收广播协议
   * 
   * @param pbean
   */
  void timPresence(const TimPBean& pbean) {
    // Your implementation goes here
    printf("timPresence\n");
  }

  /**
   * 发送信息或接收信息
   * 
   * @param mbean
   */
  void timMessage(const TimMBean& mbean) {
    // Your implementation goes here
    printf("timMessage\n");
  }

  /**
   * ping 心跳协议
   * 
   * @param threadId
   */
  void timPing(const std::string& threadId) {
    // Your implementation goes here
    printf("timPing\n");
  }

  /**
   * 错误通知
   * 
   * @param e
   */
  void timError(const TimError& e) {
    // Your implementation goes here
    printf("timError\n");
  }

  /**
   * 登出协议
   */
  void timLogout() {
    // Your implementation goes here
    printf("timLogout\n");
  }

  /**
   * 注册协议
   * 
   * @param tid
   * @param auth
   */
  void timRegist(const Tid& tid, const std::string& auth) {
    // Your implementation goes here
    printf("timRegist\n");
  }

  /**
   * 花名册
   * 
   * @param roster
   */
  void timRoser(const TimRoster& roster) {
    // Your implementation goes here
    printf("timRoser\n");
  }

  /**
   * 发送信息或接收信息列表（合流）
   * 
   * @param mbeanList
   */
  void timMessageList(const TimMBeanList& mbeanList) {
    // Your implementation goes here
    printf("timMessageList\n");
  }

  /**
   * 发送状态信息列表（合流）
   * 
   * @param pbeanList
   */
  void timPresenceList(const TimPBeanList& pbeanList) {
    // Your implementation goes here
    printf("timPresenceList\n");
  }

  /**
   * 信息请求 get请求数据 del删除
   * 
   * @param timMsgIq
   * @param iqType
   */
  void timMessageIq(const TimMessageIq& timMsgIq, const std::string& iqType) {
    // Your implementation goes here
    printf("timMessageIq\n");
  }

  /**
   * 信息请求
   * 
   * @param mbean
   */
  void timMessageResult(const TimMBean& mbean) {
    // Your implementation goes here
    printf("timMessageResult\n");
  }

  /**
   * 用户协议属性请求
   * 
   * @param tpb
   */
  void timProperty(const TimPropertyBean& tpb) {
    // Your implementation goes here
    printf("timProperty\n");
  }

  /**
   * 请求远程验证信息
   * 
   * @param tid
   * @param pwd
   * @param auth
   */
  void timRemoteUserAuth(TimRemoteUserBean& _return, const Tid& tid, const std::string& pwd, const TimAuth& auth) {
    // Your implementation goes here
    printf("timRemoteUserAuth\n");
  }

  /**
   * 请求远程用户信息
   * 
   * @param tid
   * @param auth
   */
  void timRemoteUserGet(TimRemoteUserBean& _return, const Tid& tid, const TimAuth& auth) {
    // Your implementation goes here
    printf("timRemoteUserGet\n");
  }

  /**
   * 编辑远程用户信息
   * 
   * @param tid
   * @param ub
   * @param auth
   */
  void timRemoteUserEdit(TimRemoteUserBean& _return, const Tid& tid, const TimUserBean& ub, const TimAuth& auth) {
    // Your implementation goes here
    printf("timRemoteUserEdit\n");
  }

  /**
   * 广播出席协议或接收广播协议
   * 
   * @param pbean
   * @param auth
   */
  void timResponsePresence(TimResponseBean& _return, const TimPBean& pbean, const TimAuth& auth) {
    // Your implementation goes here
    printf("timResponsePresence\n");
  }

  /**
   * 发送信息或接收信息
   * 
   * @param mbean
   * @param auth
   */
  void timResponseMessage(TimResponseBean& _return, const TimMBean& mbean, const TimAuth& auth) {
    // Your implementation goes here
    printf("timResponseMessage\n");
  }

  /**
   * 信息请求 get请求数据 del删除（辅助接口）
   * 
   * @param timMsgIq
   * @param iqType
   * @param auth
   */
  void timResponseMessageIq(TimMBeanList& _return, const TimMessageIq& timMsgIq, const std::string& iqType, const TimAuth& auth) {
    // Your implementation goes here
    printf("timResponseMessageIq\n");
  }

  /**
   * 广播出席协议或接收广播协议
   * 
   * @param pbeanList
   * @param auth
   */
  void timResponsePresenceList(TimResponseBean& _return, const TimPBeanList& pbeanList, const TimAuth& auth) {
    // Your implementation goes here
    printf("timResponsePresenceList\n");
  }

  /**
   * 发送信息或接收信息
   * 
   * @param mbeanList
   * @param auth
   */
  void timResponseMessageList(TimResponseBean& _return, const TimMBeanList& mbeanList, const TimAuth& auth) {
    // Your implementation goes here
    printf("timResponseMessageList\n");
  }

};

int main(int argc, char **argv) {
  int port = 9090;
  shared_ptr<ITimHandler> handler(new ITimHandler());
  shared_ptr<TProcessor> processor(new ITimProcessor(handler));
  shared_ptr<TServerTransport> serverTransport(new TServerSocket(port));
  shared_ptr<TTransportFactory> transportFactory(new TBufferedTransportFactory());
  shared_ptr<TProtocolFactory> protocolFactory(new TBinaryProtocolFactory());

  TSimpleServer server(processor, serverTransport, transportFactory, protocolFactory);
  server.serve();
  return 0;
}

