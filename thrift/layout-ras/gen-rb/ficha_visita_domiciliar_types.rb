#
# Autogenerated by Thrift Compiler (0.9.3)
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#

require 'thrift'
require 'common_types'


module Br
  module Gov
    module Saude
      module Esusab
        module Ras
          module Visitadomiciliar
            class FichaVisitaDomiciliarChildThrift
              include ::Thrift::Struct, ::Thrift::Struct_Union
              TURNO = 1
              NUMPRONTUARIO = 2
              CNSCIDADAO = 3
              DTNASCIMENTO = 4
              SEXO = 5
              STATUSVISITACOMPARTILHADAOUTROPROFISSIONAL = 6
              MOTIVOSVISITA = 7
              DESFECHO = 8
              MICROAREA = 9
              STFORAAREA = 10
              TIPODEIMOVEL = 11
              PESOACOMPANHAMENTONUTRICIONAL = 12
              ALTURAACOMPANHAMENTONUTRICIONAL = 13
              CPFCIDADAO = 14
              PRESSAOSISTOLICA = 15
              PRESSAODIASTOLICA = 16
              TEMPERATURA = 17
              TIPOGLICEMIA = 18
              GLICEMIA = 19
              LATITUDE = 20
              LONGITUDE = 21
              UUIDFCD = 22

              FIELDS = {
                TURNO => {:type => ::Thrift::Types::I64, :name => 'turno', :optional => true},
                NUMPRONTUARIO => {:type => ::Thrift::Types::STRING, :name => 'numProntuario', :optional => true},
                CNSCIDADAO => {:type => ::Thrift::Types::STRING, :name => 'cnsCidadao', :optional => true},
                DTNASCIMENTO => {:type => ::Thrift::Types::I64, :name => 'dtNascimento', :optional => true},
                SEXO => {:type => ::Thrift::Types::I64, :name => 'sexo', :optional => true},
                STATUSVISITACOMPARTILHADAOUTROPROFISSIONAL => {:type => ::Thrift::Types::BOOL, :name => 'statusVisitaCompartilhadaOutroProfissional', :optional => true},
                MOTIVOSVISITA => {:type => ::Thrift::Types::LIST, :name => 'motivosVisita', :element => {:type => ::Thrift::Types::I64}, :optional => true},
                DESFECHO => {:type => ::Thrift::Types::I64, :name => 'desfecho', :optional => true},
                MICROAREA => {:type => ::Thrift::Types::STRING, :name => 'microArea', :optional => true},
                STFORAAREA => {:type => ::Thrift::Types::BOOL, :name => 'stForaArea', :optional => true},
                TIPODEIMOVEL => {:type => ::Thrift::Types::I64, :name => 'tipoDeImovel', :optional => true},
                PESOACOMPANHAMENTONUTRICIONAL => {:type => ::Thrift::Types::DOUBLE, :name => 'pesoAcompanhamentoNutricional', :optional => true},
                ALTURAACOMPANHAMENTONUTRICIONAL => {:type => ::Thrift::Types::DOUBLE, :name => 'alturaAcompanhamentoNutricional', :optional => true},
                CPFCIDADAO => {:type => ::Thrift::Types::STRING, :name => 'cpfCidadao', :optional => true},
                PRESSAOSISTOLICA => {:type => ::Thrift::Types::I32, :name => 'pressaoSistolica', :optional => true},
                PRESSAODIASTOLICA => {:type => ::Thrift::Types::I32, :name => 'pressaoDiastolica', :optional => true},
                TEMPERATURA => {:type => ::Thrift::Types::DOUBLE, :name => 'temperatura', :optional => true},
                TIPOGLICEMIA => {:type => ::Thrift::Types::I64, :name => 'tipoGlicemia', :optional => true},
                GLICEMIA => {:type => ::Thrift::Types::I32, :name => 'glicemia', :optional => true},
                LATITUDE => {:type => ::Thrift::Types::DOUBLE, :name => 'latitude', :optional => true},
                LONGITUDE => {:type => ::Thrift::Types::DOUBLE, :name => 'longitude', :optional => true},
                UUIDFCD => {:type => ::Thrift::Types::STRING, :name => 'uuidFcd', :optional => true}
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
                HEADERTRANSPORT => {:type => ::Thrift::Types::STRUCT, :name => 'headerTransport', :class => ::Br::Gov::Saude::Esusab::Ras::Common::UnicaLotacaoHeaderThrift, :optional => true},
                VISITASDOMICILIARES => {:type => ::Thrift::Types::LIST, :name => 'visitasDomiciliares', :element => {:type => ::Thrift::Types::STRUCT, :class => ::Br::Gov::Saude::Esusab::Ras::Visitadomiciliar::FichaVisitaDomiciliarChildThrift}, :optional => true}
              }

              def struct_fields; FIELDS; end

              def validate
                raise ::Thrift::ProtocolException.new(::Thrift::ProtocolException::UNKNOWN, 'Required field uuidFicha is unset!') unless @uuidFicha
              end

              ::Thrift::Struct.generate_accessors self
            end

          end
        end
      end
    end
  end
end
