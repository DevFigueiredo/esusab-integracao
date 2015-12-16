#
# Autogenerated by Thrift Compiler (0.9.2)
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#

require 'thrift'

module Br
  module Gov
    module Saude
      module Esus
        module Cds
          module Transport
            module Generated
              module Thrift
                module Common
                  class HeaderCdsCadastroThrift
                    include ::Thrift::Struct, ::Thrift::Struct_Union
                    CNESUNIDADESAUDE = 1
                    CNSPROFISSIONAL = 2
                    CODIGOIBGEMUNICIPIO = 3
                    DATAATENDIMENTO = 4
                    INEEQUIPE = 5
                    MICROAREA = 6

                    FIELDS = {
                      CNESUNIDADESAUDE => {:type => ::Thrift::Types::STRING, :name => 'cnesUnidadeSaude'},
                      CNSPROFISSIONAL => {:type => ::Thrift::Types::STRING, :name => 'cnsProfissional', :optional => true},
                      CODIGOIBGEMUNICIPIO => {:type => ::Thrift::Types::STRING, :name => 'codigoIbgeMunicipio', :optional => true},
                      DATAATENDIMENTO => {:type => ::Thrift::Types::I64, :name => 'dataAtendimento', :optional => true},
                      INEEQUIPE => {:type => ::Thrift::Types::STRING, :name => 'ineEquipe', :optional => true},
                      MICROAREA => {:type => ::Thrift::Types::I64, :name => 'microarea', :optional => true}
                    }

                    def struct_fields; FIELDS; end

                    def validate
                      raise ::Thrift::ProtocolException.new(::Thrift::ProtocolException::UNKNOWN, 'Required field cnesUnidadeSaude is unset!') unless @cnesUnidadeSaude
                    end

                    ::Thrift::Struct.generate_accessors self
                  end

                  # Representa um profissional
                  class UnicaLotacaoHeaderThrift
                    include ::Thrift::Struct, ::Thrift::Struct_Union
                    PROFISSIONALCNS = 1
                    CBOCODIGO_2002 = 2
                    CNES = 3
                    INE = 4
                    DATAATENDIMENTO = 5
                    CODIGOIBGEMUNICIPIO = 6

                    FIELDS = {
                      PROFISSIONALCNS => {:type => ::Thrift::Types::STRING, :name => 'profissionalCNS', :optional => true},
                      CBOCODIGO_2002 => {:type => ::Thrift::Types::STRING, :name => 'cboCodigo_2002', :optional => true},
                      CNES => {:type => ::Thrift::Types::STRING, :name => 'cnes'},
                      INE => {:type => ::Thrift::Types::STRING, :name => 'ine', :optional => true},
                      DATAATENDIMENTO => {:type => ::Thrift::Types::I64, :name => 'dataAtendimento', :optional => true},
                      CODIGOIBGEMUNICIPIO => {:type => ::Thrift::Types::STRING, :name => 'codigoIbgeMunicipio', :optional => true}
                    }

                    def struct_fields; FIELDS; end

                    def validate
                      raise ::Thrift::ProtocolException.new(::Thrift::ProtocolException::UNKNOWN, 'Required field cnes is unset!') unless @cnes
                    end

                    ::Thrift::Struct.generate_accessors self
                  end

                  class VariasLotacoesHeaderThrift
                    include ::Thrift::Struct, ::Thrift::Struct_Union
                    LOTACAOFORM = 1
                    PROFISSIONALCNS1 = 2
                    CBOCODIGO_2002_1 = 3
                    PROFISSIONALCNS2 = 4
                    CBOCODIGO_2002_2 = 5

                    FIELDS = {
                      LOTACAOFORM => {:type => ::Thrift::Types::STRUCT, :name => 'lotacaoForm', :class => ::Br::Gov::Saude::Esus::Cds::Transport::Generated::Thrift::Common::UnicaLotacaoHeaderThrift},
                      PROFISSIONALCNS1 => {:type => ::Thrift::Types::STRING, :name => 'profissionalCNS1', :optional => true},
                      CBOCODIGO_2002_1 => {:type => ::Thrift::Types::STRING, :name => 'cboCodigo_2002_1', :optional => true},
                      PROFISSIONALCNS2 => {:type => ::Thrift::Types::STRING, :name => 'profissionalCNS2', :optional => true},
                      CBOCODIGO_2002_2 => {:type => ::Thrift::Types::STRING, :name => 'cboCodigo_2002_2', :optional => true}
                    }

                    def struct_fields; FIELDS; end

                    def validate
                      raise ::Thrift::ProtocolException.new(::Thrift::ProtocolException::UNKNOWN, 'Required field lotacaoForm is unset!') unless @lotacaoForm
                    end

                    ::Thrift::Struct.generate_accessors self
                  end

                  class EnderecoLocalPermanenciaThrift
                    include ::Thrift::Struct, ::Thrift::Struct_Union
                    BAIRRO = 1
                    CEP = 2
                    CODIGOIBGEMUNICIPIO = 3
                    COMPLEMENTO = 4
                    NOMELOGRADOURO = 5
                    NUMERO = 6
                    NUMERODNEUF = 7
                    TELREFERENCIAL = 8
                    TELRESIDENCIAL = 9
                    TIPOLOGRADOURONUMERODNE = 10
                    STSEMNUMERO = 11

                    FIELDS = {
                      BAIRRO => {:type => ::Thrift::Types::STRING, :name => 'bairro', :optional => true},
                      CEP => {:type => ::Thrift::Types::STRING, :name => 'cep', :optional => true},
                      CODIGOIBGEMUNICIPIO => {:type => ::Thrift::Types::STRING, :name => 'codigoIbgeMunicipio', :optional => true},
                      COMPLEMENTO => {:type => ::Thrift::Types::STRING, :name => 'complemento', :optional => true},
                      NOMELOGRADOURO => {:type => ::Thrift::Types::STRING, :name => 'nomeLogradouro', :optional => true},
                      NUMERO => {:type => ::Thrift::Types::STRING, :name => 'numero', :optional => true},
                      NUMERODNEUF => {:type => ::Thrift::Types::STRING, :name => 'numeroDneUf', :optional => true},
                      TELREFERENCIAL => {:type => ::Thrift::Types::STRING, :name => 'telReferencial', :optional => true},
                      TELRESIDENCIAL => {:type => ::Thrift::Types::STRING, :name => 'telResidencial', :optional => true},
                      TIPOLOGRADOURONUMERODNE => {:type => ::Thrift::Types::STRING, :name => 'tipoLogradouroNumeroDne', :optional => true},
                      STSEMNUMERO => {:type => ::Thrift::Types::BOOL, :name => 'stSemNumero', :optional => true}
                    }

                    def struct_fields; FIELDS; end

                    def validate
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