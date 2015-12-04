#
# Autogenerated by Thrift Compiler (0.9.2)
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#

require 'thrift'
require 'br/gov/saude/esus/cds/transport/generated/thrift/common/common_types'


module Br
  module Gov
    module Saude
      module Esus
        module Cds
          module Transport
            module Generated
              module Thrift
                module Visitadomiciliar
                  class FichaVisitaDomiciliarChildThrift
                    include ::Thrift::Struct, ::Thrift::Struct_Union
                    TURNO = 1
                    NUMPRONTUARIO = 2
                    NUMCARTAOSUS = 3
                    DTNASCIMENTO = 4
                    SEXO = 5
                    STATUSVISITACOMPARTILHADAOUTROPROFISSIONAL = 6
                    MOTIVOSVISITA = 7
                    DESFECHO = 8

                    FIELDS = {
                      TURNO => {:type => ::Thrift::Types::I64, :name => 'turno', :optional => true},
                      NUMPRONTUARIO => {:type => ::Thrift::Types::STRING, :name => 'numProntuario', :optional => true},
                      NUMCARTAOSUS => {:type => ::Thrift::Types::STRING, :name => 'numCartaoSus', :optional => true},
                      DTNASCIMENTO => {:type => ::Thrift::Types::I64, :name => 'dtNascimento', :optional => true},
                      SEXO => {:type => ::Thrift::Types::I64, :name => 'sexo', :optional => true},
                      STATUSVISITACOMPARTILHADAOUTROPROFISSIONAL => {:type => ::Thrift::Types::BOOL, :name => 'statusVisitaCompartilhadaOutroProfissional', :optional => true},
                      MOTIVOSVISITA => {:type => ::Thrift::Types::LIST, :name => 'motivosVisita', :element => {:type => ::Thrift::Types::I64}, :optional => true},
                      DESFECHO => {:type => ::Thrift::Types::I64, :name => 'desfecho', :optional => true}
                    }

                    def struct_fields; FIELDS; end

                    def validate
                    end

                    ::Thrift::Struct.generate_accessors self
                  end

                  class FichaVisitaDomiciliarMasterThrift
                    include ::Thrift::Struct, ::Thrift::Struct_Union
                    UUIDFICHA = 1
                    TPCDSORIGEM = 2
                    HEADERTRANSPORT = 3
                    VISITASDOMICILIARES = 4

                    FIELDS = {
                      UUIDFICHA => {:type => ::Thrift::Types::STRING, :name => 'uuidFicha'},
                      TPCDSORIGEM => {:type => ::Thrift::Types::I32, :name => 'tpCdsOrigem', :optional => true},
                      HEADERTRANSPORT => {:type => ::Thrift::Types::STRUCT, :name => 'headerTransport', :class => ::Br::Gov::Saude::Esus::Cds::Transport::Generated::Thrift::Common::UnicaLotacaoHeaderThrift},
                      VISITASDOMICILIARES => {:type => ::Thrift::Types::LIST, :name => 'visitasDomiciliares', :element => {:type => ::Thrift::Types::STRUCT, :class => ::Br::Gov::Saude::Esus::Cds::Transport::Generated::Thrift::Visitadomiciliar::FichaVisitaDomiciliarChildThrift}, :optional => true}
                    }

                    def struct_fields; FIELDS; end

                    def validate
                      raise ::Thrift::ProtocolException.new(::Thrift::ProtocolException::UNKNOWN, 'Required field uuidFicha is unset!') unless @uuidFicha
                      raise ::Thrift::ProtocolException.new(::Thrift::ProtocolException::UNKNOWN, 'Required field headerTransport is unset!') unless @headerTransport
                    end

                    ::Thrift::Struct.generate_accessors self
                  end

                end
              end
            end
          end
        end
      end
    end
  end
end