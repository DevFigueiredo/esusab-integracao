// Autogenerated by Thrift Compiler (0.9.2)
// DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING

package visitadomiciliar

import (
	"br/gov/saude/esusab/ras/common"
	"bytes"
	"fmt"
	"git.apache.org/thrift.git/lib/go/thrift"
)

// (needed to ensure safety because of naive import list construction.)
var _ = thrift.ZERO
var _ = fmt.Printf
var _ = bytes.Equal

var _ = common.GoUnusedProtection__
var GoUnusedProtection__ int

type FichaVisitaDomiciliarChildThrift struct {
	Turno                                      *int64   `thrift:"turno,1" json:"turno"`
	NumProntuario                              *string  `thrift:"numProntuario,2" json:"numProntuario"`
	CnsCidadao                                 *string  `thrift:"cnsCidadao,3" json:"cnsCidadao"`
	DtNascimento                               *int64   `thrift:"dtNascimento,4" json:"dtNascimento"`
	Sexo                                       *int64   `thrift:"sexo,5" json:"sexo"`
	StatusVisitaCompartilhadaOutroProfissional *bool    `thrift:"statusVisitaCompartilhadaOutroProfissional,6" json:"statusVisitaCompartilhadaOutroProfissional"`
	MotivosVisita                              []int64  `thrift:"motivosVisita,7" json:"motivosVisita"`
	Desfecho                                   *int64   `thrift:"desfecho,8" json:"desfecho"`
	MicroArea                                  *string  `thrift:"microArea,9" json:"microArea"`
	StForaArea                                 *bool    `thrift:"stForaArea,10" json:"stForaArea"`
	TipoDeImovel                               *int64   `thrift:"tipoDeImovel,11" json:"tipoDeImovel"`
	PesoAcompanhamentoNutricional              *float64 `thrift:"pesoAcompanhamentoNutricional,12" json:"pesoAcompanhamentoNutricional"`
	AlturaAcompanhamentoNutricional            *float64 `thrift:"alturaAcompanhamentoNutricional,13" json:"alturaAcompanhamentoNutricional"`
}

func NewFichaVisitaDomiciliarChildThrift() *FichaVisitaDomiciliarChildThrift {
	return &FichaVisitaDomiciliarChildThrift{}
}

var FichaVisitaDomiciliarChildThrift_Turno_DEFAULT int64

func (p *FichaVisitaDomiciliarChildThrift) GetTurno() int64 {
	if !p.IsSetTurno() {
		return FichaVisitaDomiciliarChildThrift_Turno_DEFAULT
	}
	return *p.Turno
}

var FichaVisitaDomiciliarChildThrift_NumProntuario_DEFAULT string

func (p *FichaVisitaDomiciliarChildThrift) GetNumProntuario() string {
	if !p.IsSetNumProntuario() {
		return FichaVisitaDomiciliarChildThrift_NumProntuario_DEFAULT
	}
	return *p.NumProntuario
}

var FichaVisitaDomiciliarChildThrift_CnsCidadao_DEFAULT string

func (p *FichaVisitaDomiciliarChildThrift) GetCnsCidadao() string {
	if !p.IsSetCnsCidadao() {
		return FichaVisitaDomiciliarChildThrift_CnsCidadao_DEFAULT
	}
	return *p.CnsCidadao
}

var FichaVisitaDomiciliarChildThrift_DtNascimento_DEFAULT int64

func (p *FichaVisitaDomiciliarChildThrift) GetDtNascimento() int64 {
	if !p.IsSetDtNascimento() {
		return FichaVisitaDomiciliarChildThrift_DtNascimento_DEFAULT
	}
	return *p.DtNascimento
}

var FichaVisitaDomiciliarChildThrift_Sexo_DEFAULT int64

func (p *FichaVisitaDomiciliarChildThrift) GetSexo() int64 {
	if !p.IsSetSexo() {
		return FichaVisitaDomiciliarChildThrift_Sexo_DEFAULT
	}
	return *p.Sexo
}

var FichaVisitaDomiciliarChildThrift_StatusVisitaCompartilhadaOutroProfissional_DEFAULT bool

func (p *FichaVisitaDomiciliarChildThrift) GetStatusVisitaCompartilhadaOutroProfissional() bool {
	if !p.IsSetStatusVisitaCompartilhadaOutroProfissional() {
		return FichaVisitaDomiciliarChildThrift_StatusVisitaCompartilhadaOutroProfissional_DEFAULT
	}
	return *p.StatusVisitaCompartilhadaOutroProfissional
}

var FichaVisitaDomiciliarChildThrift_MotivosVisita_DEFAULT []int64

func (p *FichaVisitaDomiciliarChildThrift) GetMotivosVisita() []int64 {
	return p.MotivosVisita
}

var FichaVisitaDomiciliarChildThrift_Desfecho_DEFAULT int64

func (p *FichaVisitaDomiciliarChildThrift) GetDesfecho() int64 {
	if !p.IsSetDesfecho() {
		return FichaVisitaDomiciliarChildThrift_Desfecho_DEFAULT
	}
	return *p.Desfecho
}

var FichaVisitaDomiciliarChildThrift_MicroArea_DEFAULT string

func (p *FichaVisitaDomiciliarChildThrift) GetMicroArea() string {
	if !p.IsSetMicroArea() {
		return FichaVisitaDomiciliarChildThrift_MicroArea_DEFAULT
	}
	return *p.MicroArea
}

var FichaVisitaDomiciliarChildThrift_StForaArea_DEFAULT bool

func (p *FichaVisitaDomiciliarChildThrift) GetStForaArea() bool {
	if !p.IsSetStForaArea() {
		return FichaVisitaDomiciliarChildThrift_StForaArea_DEFAULT
	}
	return *p.StForaArea
}

var FichaVisitaDomiciliarChildThrift_TipoDeImovel_DEFAULT int64

func (p *FichaVisitaDomiciliarChildThrift) GetTipoDeImovel() int64 {
	if !p.IsSetTipoDeImovel() {
		return FichaVisitaDomiciliarChildThrift_TipoDeImovel_DEFAULT
	}
	return *p.TipoDeImovel
}

var FichaVisitaDomiciliarChildThrift_PesoAcompanhamentoNutricional_DEFAULT float64

func (p *FichaVisitaDomiciliarChildThrift) GetPesoAcompanhamentoNutricional() float64 {
	if !p.IsSetPesoAcompanhamentoNutricional() {
		return FichaVisitaDomiciliarChildThrift_PesoAcompanhamentoNutricional_DEFAULT
	}
	return *p.PesoAcompanhamentoNutricional
}

var FichaVisitaDomiciliarChildThrift_AlturaAcompanhamentoNutricional_DEFAULT float64

func (p *FichaVisitaDomiciliarChildThrift) GetAlturaAcompanhamentoNutricional() float64 {
	if !p.IsSetAlturaAcompanhamentoNutricional() {
		return FichaVisitaDomiciliarChildThrift_AlturaAcompanhamentoNutricional_DEFAULT
	}
	return *p.AlturaAcompanhamentoNutricional
}
func (p *FichaVisitaDomiciliarChildThrift) IsSetTurno() bool {
	return p.Turno != nil
}

func (p *FichaVisitaDomiciliarChildThrift) IsSetNumProntuario() bool {
	return p.NumProntuario != nil
}

func (p *FichaVisitaDomiciliarChildThrift) IsSetCnsCidadao() bool {
	return p.CnsCidadao != nil
}

func (p *FichaVisitaDomiciliarChildThrift) IsSetDtNascimento() bool {
	return p.DtNascimento != nil
}

func (p *FichaVisitaDomiciliarChildThrift) IsSetSexo() bool {
	return p.Sexo != nil
}

func (p *FichaVisitaDomiciliarChildThrift) IsSetStatusVisitaCompartilhadaOutroProfissional() bool {
	return p.StatusVisitaCompartilhadaOutroProfissional != nil
}

func (p *FichaVisitaDomiciliarChildThrift) IsSetMotivosVisita() bool {
	return p.MotivosVisita != nil
}

func (p *FichaVisitaDomiciliarChildThrift) IsSetDesfecho() bool {
	return p.Desfecho != nil
}

func (p *FichaVisitaDomiciliarChildThrift) IsSetMicroArea() bool {
	return p.MicroArea != nil
}

func (p *FichaVisitaDomiciliarChildThrift) IsSetStForaArea() bool {
	return p.StForaArea != nil
}

func (p *FichaVisitaDomiciliarChildThrift) IsSetTipoDeImovel() bool {
	return p.TipoDeImovel != nil
}

func (p *FichaVisitaDomiciliarChildThrift) IsSetPesoAcompanhamentoNutricional() bool {
	return p.PesoAcompanhamentoNutricional != nil
}

func (p *FichaVisitaDomiciliarChildThrift) IsSetAlturaAcompanhamentoNutricional() bool {
	return p.AlturaAcompanhamentoNutricional != nil
}

func (p *FichaVisitaDomiciliarChildThrift) Read(iprot thrift.TProtocol) error {
	if _, err := iprot.ReadStructBegin(); err != nil {
		return fmt.Errorf("%T read error: %s", p, err)
	}
	for {
		_, fieldTypeId, fieldId, err := iprot.ReadFieldBegin()
		if err != nil {
			return fmt.Errorf("%T field %d read error: %s", p, fieldId, err)
		}
		if fieldTypeId == thrift.STOP {
			break
		}
		switch fieldId {
		case 1:
			if err := p.ReadField1(iprot); err != nil {
				return err
			}
		case 2:
			if err := p.ReadField2(iprot); err != nil {
				return err
			}
		case 3:
			if err := p.ReadField3(iprot); err != nil {
				return err
			}
		case 4:
			if err := p.ReadField4(iprot); err != nil {
				return err
			}
		case 5:
			if err := p.ReadField5(iprot); err != nil {
				return err
			}
		case 6:
			if err := p.ReadField6(iprot); err != nil {
				return err
			}
		case 7:
			if err := p.ReadField7(iprot); err != nil {
				return err
			}
		case 8:
			if err := p.ReadField8(iprot); err != nil {
				return err
			}
		case 9:
			if err := p.ReadField9(iprot); err != nil {
				return err
			}
		case 10:
			if err := p.ReadField10(iprot); err != nil {
				return err
			}
		case 11:
			if err := p.ReadField11(iprot); err != nil {
				return err
			}
		case 12:
			if err := p.ReadField12(iprot); err != nil {
				return err
			}
		case 13:
			if err := p.ReadField13(iprot); err != nil {
				return err
			}
		default:
			if err := iprot.Skip(fieldTypeId); err != nil {
				return err
			}
		}
		if err := iprot.ReadFieldEnd(); err != nil {
			return err
		}
	}
	if err := iprot.ReadStructEnd(); err != nil {
		return fmt.Errorf("%T read struct end error: %s", p, err)
	}
	return nil
}

func (p *FichaVisitaDomiciliarChildThrift) ReadField1(iprot thrift.TProtocol) error {
	if v, err := iprot.ReadI64(); err != nil {
		return fmt.Errorf("error reading field 1: %s", err)
	} else {
		p.Turno = &v
	}
	return nil
}

func (p *FichaVisitaDomiciliarChildThrift) ReadField2(iprot thrift.TProtocol) error {
	if v, err := iprot.ReadString(); err != nil {
		return fmt.Errorf("error reading field 2: %s", err)
	} else {
		p.NumProntuario = &v
	}
	return nil
}

func (p *FichaVisitaDomiciliarChildThrift) ReadField3(iprot thrift.TProtocol) error {
	if v, err := iprot.ReadString(); err != nil {
		return fmt.Errorf("error reading field 3: %s", err)
	} else {
		p.CnsCidadao = &v
	}
	return nil
}

func (p *FichaVisitaDomiciliarChildThrift) ReadField4(iprot thrift.TProtocol) error {
	if v, err := iprot.ReadI64(); err != nil {
		return fmt.Errorf("error reading field 4: %s", err)
	} else {
		p.DtNascimento = &v
	}
	return nil
}

func (p *FichaVisitaDomiciliarChildThrift) ReadField5(iprot thrift.TProtocol) error {
	if v, err := iprot.ReadI64(); err != nil {
		return fmt.Errorf("error reading field 5: %s", err)
	} else {
		p.Sexo = &v
	}
	return nil
}

func (p *FichaVisitaDomiciliarChildThrift) ReadField6(iprot thrift.TProtocol) error {
	if v, err := iprot.ReadBool(); err != nil {
		return fmt.Errorf("error reading field 6: %s", err)
	} else {
		p.StatusVisitaCompartilhadaOutroProfissional = &v
	}
	return nil
}

func (p *FichaVisitaDomiciliarChildThrift) ReadField7(iprot thrift.TProtocol) error {
	_, size, err := iprot.ReadListBegin()
	if err != nil {
		return fmt.Errorf("error reading list begin: %s", err)
	}
	tSlice := make([]int64, 0, size)
	p.MotivosVisita = tSlice
	for i := 0; i < size; i++ {
		var _elem0 int64
		if v, err := iprot.ReadI64(); err != nil {
			return fmt.Errorf("error reading field 0: %s", err)
		} else {
			_elem0 = v
		}
		p.MotivosVisita = append(p.MotivosVisita, _elem0)
	}
	if err := iprot.ReadListEnd(); err != nil {
		return fmt.Errorf("error reading list end: %s", err)
	}
	return nil
}

func (p *FichaVisitaDomiciliarChildThrift) ReadField8(iprot thrift.TProtocol) error {
	if v, err := iprot.ReadI64(); err != nil {
		return fmt.Errorf("error reading field 8: %s", err)
	} else {
		p.Desfecho = &v
	}
	return nil
}

func (p *FichaVisitaDomiciliarChildThrift) ReadField9(iprot thrift.TProtocol) error {
	if v, err := iprot.ReadString(); err != nil {
		return fmt.Errorf("error reading field 9: %s", err)
	} else {
		p.MicroArea = &v
	}
	return nil
}

func (p *FichaVisitaDomiciliarChildThrift) ReadField10(iprot thrift.TProtocol) error {
	if v, err := iprot.ReadBool(); err != nil {
		return fmt.Errorf("error reading field 10: %s", err)
	} else {
		p.StForaArea = &v
	}
	return nil
}

func (p *FichaVisitaDomiciliarChildThrift) ReadField11(iprot thrift.TProtocol) error {
	if v, err := iprot.ReadI64(); err != nil {
		return fmt.Errorf("error reading field 11: %s", err)
	} else {
		p.TipoDeImovel = &v
	}
	return nil
}

func (p *FichaVisitaDomiciliarChildThrift) ReadField12(iprot thrift.TProtocol) error {
	if v, err := iprot.ReadDouble(); err != nil {
		return fmt.Errorf("error reading field 12: %s", err)
	} else {
		p.PesoAcompanhamentoNutricional = &v
	}
	return nil
}

func (p *FichaVisitaDomiciliarChildThrift) ReadField13(iprot thrift.TProtocol) error {
	if v, err := iprot.ReadDouble(); err != nil {
		return fmt.Errorf("error reading field 13: %s", err)
	} else {
		p.AlturaAcompanhamentoNutricional = &v
	}
	return nil
}

func (p *FichaVisitaDomiciliarChildThrift) Write(oprot thrift.TProtocol) error {
	if err := oprot.WriteStructBegin("FichaVisitaDomiciliarChildThrift"); err != nil {
		return fmt.Errorf("%T write struct begin error: %s", p, err)
	}
	if err := p.writeField1(oprot); err != nil {
		return err
	}
	if err := p.writeField2(oprot); err != nil {
		return err
	}
	if err := p.writeField3(oprot); err != nil {
		return err
	}
	if err := p.writeField4(oprot); err != nil {
		return err
	}
	if err := p.writeField5(oprot); err != nil {
		return err
	}
	if err := p.writeField6(oprot); err != nil {
		return err
	}
	if err := p.writeField7(oprot); err != nil {
		return err
	}
	if err := p.writeField8(oprot); err != nil {
		return err
	}
	if err := p.writeField9(oprot); err != nil {
		return err
	}
	if err := p.writeField10(oprot); err != nil {
		return err
	}
	if err := p.writeField11(oprot); err != nil {
		return err
	}
	if err := p.writeField12(oprot); err != nil {
		return err
	}
	if err := p.writeField13(oprot); err != nil {
		return err
	}
	if err := oprot.WriteFieldStop(); err != nil {
		return fmt.Errorf("write field stop error: %s", err)
	}
	if err := oprot.WriteStructEnd(); err != nil {
		return fmt.Errorf("write struct stop error: %s", err)
	}
	return nil
}

func (p *FichaVisitaDomiciliarChildThrift) writeField1(oprot thrift.TProtocol) (err error) {
	if p.IsSetTurno() {
		if err := oprot.WriteFieldBegin("turno", thrift.I64, 1); err != nil {
			return fmt.Errorf("%T write field begin error 1:turno: %s", p, err)
		}
		if err := oprot.WriteI64(int64(*p.Turno)); err != nil {
			return fmt.Errorf("%T.turno (1) field write error: %s", p, err)
		}
		if err := oprot.WriteFieldEnd(); err != nil {
			return fmt.Errorf("%T write field end error 1:turno: %s", p, err)
		}
	}
	return err
}

func (p *FichaVisitaDomiciliarChildThrift) writeField2(oprot thrift.TProtocol) (err error) {
	if p.IsSetNumProntuario() {
		if err := oprot.WriteFieldBegin("numProntuario", thrift.STRING, 2); err != nil {
			return fmt.Errorf("%T write field begin error 2:numProntuario: %s", p, err)
		}
		if err := oprot.WriteString(string(*p.NumProntuario)); err != nil {
			return fmt.Errorf("%T.numProntuario (2) field write error: %s", p, err)
		}
		if err := oprot.WriteFieldEnd(); err != nil {
			return fmt.Errorf("%T write field end error 2:numProntuario: %s", p, err)
		}
	}
	return err
}

func (p *FichaVisitaDomiciliarChildThrift) writeField3(oprot thrift.TProtocol) (err error) {
	if p.IsSetCnsCidadao() {
		if err := oprot.WriteFieldBegin("cnsCidadao", thrift.STRING, 3); err != nil {
			return fmt.Errorf("%T write field begin error 3:cnsCidadao: %s", p, err)
		}
		if err := oprot.WriteString(string(*p.CnsCidadao)); err != nil {
			return fmt.Errorf("%T.cnsCidadao (3) field write error: %s", p, err)
		}
		if err := oprot.WriteFieldEnd(); err != nil {
			return fmt.Errorf("%T write field end error 3:cnsCidadao: %s", p, err)
		}
	}
	return err
}

func (p *FichaVisitaDomiciliarChildThrift) writeField4(oprot thrift.TProtocol) (err error) {
	if p.IsSetDtNascimento() {
		if err := oprot.WriteFieldBegin("dtNascimento", thrift.I64, 4); err != nil {
			return fmt.Errorf("%T write field begin error 4:dtNascimento: %s", p, err)
		}
		if err := oprot.WriteI64(int64(*p.DtNascimento)); err != nil {
			return fmt.Errorf("%T.dtNascimento (4) field write error: %s", p, err)
		}
		if err := oprot.WriteFieldEnd(); err != nil {
			return fmt.Errorf("%T write field end error 4:dtNascimento: %s", p, err)
		}
	}
	return err
}

func (p *FichaVisitaDomiciliarChildThrift) writeField5(oprot thrift.TProtocol) (err error) {
	if p.IsSetSexo() {
		if err := oprot.WriteFieldBegin("sexo", thrift.I64, 5); err != nil {
			return fmt.Errorf("%T write field begin error 5:sexo: %s", p, err)
		}
		if err := oprot.WriteI64(int64(*p.Sexo)); err != nil {
			return fmt.Errorf("%T.sexo (5) field write error: %s", p, err)
		}
		if err := oprot.WriteFieldEnd(); err != nil {
			return fmt.Errorf("%T write field end error 5:sexo: %s", p, err)
		}
	}
	return err
}

func (p *FichaVisitaDomiciliarChildThrift) writeField6(oprot thrift.TProtocol) (err error) {
	if p.IsSetStatusVisitaCompartilhadaOutroProfissional() {
		if err := oprot.WriteFieldBegin("statusVisitaCompartilhadaOutroProfissional", thrift.BOOL, 6); err != nil {
			return fmt.Errorf("%T write field begin error 6:statusVisitaCompartilhadaOutroProfissional: %s", p, err)
		}
		if err := oprot.WriteBool(bool(*p.StatusVisitaCompartilhadaOutroProfissional)); err != nil {
			return fmt.Errorf("%T.statusVisitaCompartilhadaOutroProfissional (6) field write error: %s", p, err)
		}
		if err := oprot.WriteFieldEnd(); err != nil {
			return fmt.Errorf("%T write field end error 6:statusVisitaCompartilhadaOutroProfissional: %s", p, err)
		}
	}
	return err
}

func (p *FichaVisitaDomiciliarChildThrift) writeField7(oprot thrift.TProtocol) (err error) {
	if p.IsSetMotivosVisita() {
		if err := oprot.WriteFieldBegin("motivosVisita", thrift.LIST, 7); err != nil {
			return fmt.Errorf("%T write field begin error 7:motivosVisita: %s", p, err)
		}
		if err := oprot.WriteListBegin(thrift.I64, len(p.MotivosVisita)); err != nil {
			return fmt.Errorf("error writing list begin: %s", err)
		}
		for _, v := range p.MotivosVisita {
			if err := oprot.WriteI64(int64(v)); err != nil {
				return fmt.Errorf("%T. (0) field write error: %s", p, err)
			}
		}
		if err := oprot.WriteListEnd(); err != nil {
			return fmt.Errorf("error writing list end: %s", err)
		}
		if err := oprot.WriteFieldEnd(); err != nil {
			return fmt.Errorf("%T write field end error 7:motivosVisita: %s", p, err)
		}
	}
	return err
}

func (p *FichaVisitaDomiciliarChildThrift) writeField8(oprot thrift.TProtocol) (err error) {
	if p.IsSetDesfecho() {
		if err := oprot.WriteFieldBegin("desfecho", thrift.I64, 8); err != nil {
			return fmt.Errorf("%T write field begin error 8:desfecho: %s", p, err)
		}
		if err := oprot.WriteI64(int64(*p.Desfecho)); err != nil {
			return fmt.Errorf("%T.desfecho (8) field write error: %s", p, err)
		}
		if err := oprot.WriteFieldEnd(); err != nil {
			return fmt.Errorf("%T write field end error 8:desfecho: %s", p, err)
		}
	}
	return err
}

func (p *FichaVisitaDomiciliarChildThrift) writeField9(oprot thrift.TProtocol) (err error) {
	if p.IsSetMicroArea() {
		if err := oprot.WriteFieldBegin("microArea", thrift.STRING, 9); err != nil {
			return fmt.Errorf("%T write field begin error 9:microArea: %s", p, err)
		}
		if err := oprot.WriteString(string(*p.MicroArea)); err != nil {
			return fmt.Errorf("%T.microArea (9) field write error: %s", p, err)
		}
		if err := oprot.WriteFieldEnd(); err != nil {
			return fmt.Errorf("%T write field end error 9:microArea: %s", p, err)
		}
	}
	return err
}

func (p *FichaVisitaDomiciliarChildThrift) writeField10(oprot thrift.TProtocol) (err error) {
	if p.IsSetStForaArea() {
		if err := oprot.WriteFieldBegin("stForaArea", thrift.BOOL, 10); err != nil {
			return fmt.Errorf("%T write field begin error 10:stForaArea: %s", p, err)
		}
		if err := oprot.WriteBool(bool(*p.StForaArea)); err != nil {
			return fmt.Errorf("%T.stForaArea (10) field write error: %s", p, err)
		}
		if err := oprot.WriteFieldEnd(); err != nil {
			return fmt.Errorf("%T write field end error 10:stForaArea: %s", p, err)
		}
	}
	return err
}

func (p *FichaVisitaDomiciliarChildThrift) writeField11(oprot thrift.TProtocol) (err error) {
	if p.IsSetTipoDeImovel() {
		if err := oprot.WriteFieldBegin("tipoDeImovel", thrift.I64, 11); err != nil {
			return fmt.Errorf("%T write field begin error 11:tipoDeImovel: %s", p, err)
		}
		if err := oprot.WriteI64(int64(*p.TipoDeImovel)); err != nil {
			return fmt.Errorf("%T.tipoDeImovel (11) field write error: %s", p, err)
		}
		if err := oprot.WriteFieldEnd(); err != nil {
			return fmt.Errorf("%T write field end error 11:tipoDeImovel: %s", p, err)
		}
	}
	return err
}

func (p *FichaVisitaDomiciliarChildThrift) writeField12(oprot thrift.TProtocol) (err error) {
	if p.IsSetPesoAcompanhamentoNutricional() {
		if err := oprot.WriteFieldBegin("pesoAcompanhamentoNutricional", thrift.DOUBLE, 12); err != nil {
			return fmt.Errorf("%T write field begin error 12:pesoAcompanhamentoNutricional: %s", p, err)
		}
		if err := oprot.WriteDouble(float64(*p.PesoAcompanhamentoNutricional)); err != nil {
			return fmt.Errorf("%T.pesoAcompanhamentoNutricional (12) field write error: %s", p, err)
		}
		if err := oprot.WriteFieldEnd(); err != nil {
			return fmt.Errorf("%T write field end error 12:pesoAcompanhamentoNutricional: %s", p, err)
		}
	}
	return err
}

func (p *FichaVisitaDomiciliarChildThrift) writeField13(oprot thrift.TProtocol) (err error) {
	if p.IsSetAlturaAcompanhamentoNutricional() {
		if err := oprot.WriteFieldBegin("alturaAcompanhamentoNutricional", thrift.DOUBLE, 13); err != nil {
			return fmt.Errorf("%T write field begin error 13:alturaAcompanhamentoNutricional: %s", p, err)
		}
		if err := oprot.WriteDouble(float64(*p.AlturaAcompanhamentoNutricional)); err != nil {
			return fmt.Errorf("%T.alturaAcompanhamentoNutricional (13) field write error: %s", p, err)
		}
		if err := oprot.WriteFieldEnd(); err != nil {
			return fmt.Errorf("%T write field end error 13:alturaAcompanhamentoNutricional: %s", p, err)
		}
	}
	return err
}

func (p *FichaVisitaDomiciliarChildThrift) String() string {
	if p == nil {
		return "<nil>"
	}
	return fmt.Sprintf("FichaVisitaDomiciliarChildThrift(%+v)", *p)
}

type FichaVisitaDomiciliarMasterThrift struct {
	UuidFicha           string                              `thrift:"uuidFicha,1,required" json:"uuidFicha"`
	TpCdsOrigem         *int32                              `thrift:"tpCdsOrigem,2" json:"tpCdsOrigem"`
	HeaderTransport     *common.UnicaLotacaoHeaderThrift    `thrift:"headerTransport,3" json:"headerTransport"`
	VisitasDomiciliares []*FichaVisitaDomiciliarChildThrift `thrift:"visitasDomiciliares,4" json:"visitasDomiciliares"`
}

func NewFichaVisitaDomiciliarMasterThrift() *FichaVisitaDomiciliarMasterThrift {
	return &FichaVisitaDomiciliarMasterThrift{}
}

func (p *FichaVisitaDomiciliarMasterThrift) GetUuidFicha() string {
	return p.UuidFicha
}

var FichaVisitaDomiciliarMasterThrift_TpCdsOrigem_DEFAULT int32

func (p *FichaVisitaDomiciliarMasterThrift) GetTpCdsOrigem() int32 {
	if !p.IsSetTpCdsOrigem() {
		return FichaVisitaDomiciliarMasterThrift_TpCdsOrigem_DEFAULT
	}
	return *p.TpCdsOrigem
}

var FichaVisitaDomiciliarMasterThrift_HeaderTransport_DEFAULT *common.UnicaLotacaoHeaderThrift

func (p *FichaVisitaDomiciliarMasterThrift) GetHeaderTransport() *common.UnicaLotacaoHeaderThrift {
	if !p.IsSetHeaderTransport() {
		return FichaVisitaDomiciliarMasterThrift_HeaderTransport_DEFAULT
	}
	return p.HeaderTransport
}

var FichaVisitaDomiciliarMasterThrift_VisitasDomiciliares_DEFAULT []*FichaVisitaDomiciliarChildThrift

func (p *FichaVisitaDomiciliarMasterThrift) GetVisitasDomiciliares() []*FichaVisitaDomiciliarChildThrift {
	return p.VisitasDomiciliares
}
func (p *FichaVisitaDomiciliarMasterThrift) IsSetTpCdsOrigem() bool {
	return p.TpCdsOrigem != nil
}

func (p *FichaVisitaDomiciliarMasterThrift) IsSetHeaderTransport() bool {
	return p.HeaderTransport != nil
}

func (p *FichaVisitaDomiciliarMasterThrift) IsSetVisitasDomiciliares() bool {
	return p.VisitasDomiciliares != nil
}

func (p *FichaVisitaDomiciliarMasterThrift) Read(iprot thrift.TProtocol) error {
	if _, err := iprot.ReadStructBegin(); err != nil {
		return fmt.Errorf("%T read error: %s", p, err)
	}
	for {
		_, fieldTypeId, fieldId, err := iprot.ReadFieldBegin()
		if err != nil {
			return fmt.Errorf("%T field %d read error: %s", p, fieldId, err)
		}
		if fieldTypeId == thrift.STOP {
			break
		}
		switch fieldId {
		case 1:
			if err := p.ReadField1(iprot); err != nil {
				return err
			}
		case 2:
			if err := p.ReadField2(iprot); err != nil {
				return err
			}
		case 3:
			if err := p.ReadField3(iprot); err != nil {
				return err
			}
		case 4:
			if err := p.ReadField4(iprot); err != nil {
				return err
			}
		default:
			if err := iprot.Skip(fieldTypeId); err != nil {
				return err
			}
		}
		if err := iprot.ReadFieldEnd(); err != nil {
			return err
		}
	}
	if err := iprot.ReadStructEnd(); err != nil {
		return fmt.Errorf("%T read struct end error: %s", p, err)
	}
	return nil
}

func (p *FichaVisitaDomiciliarMasterThrift) ReadField1(iprot thrift.TProtocol) error {
	if v, err := iprot.ReadString(); err != nil {
		return fmt.Errorf("error reading field 1: %s", err)
	} else {
		p.UuidFicha = v
	}
	return nil
}

func (p *FichaVisitaDomiciliarMasterThrift) ReadField2(iprot thrift.TProtocol) error {
	if v, err := iprot.ReadI32(); err != nil {
		return fmt.Errorf("error reading field 2: %s", err)
	} else {
		p.TpCdsOrigem = &v
	}
	return nil
}

func (p *FichaVisitaDomiciliarMasterThrift) ReadField3(iprot thrift.TProtocol) error {
	p.HeaderTransport = &common.UnicaLotacaoHeaderThrift{}
	if err := p.HeaderTransport.Read(iprot); err != nil {
		return fmt.Errorf("%T error reading struct: %s", p.HeaderTransport, err)
	}
	return nil
}

func (p *FichaVisitaDomiciliarMasterThrift) ReadField4(iprot thrift.TProtocol) error {
	_, size, err := iprot.ReadListBegin()
	if err != nil {
		return fmt.Errorf("error reading list begin: %s", err)
	}
	tSlice := make([]*FichaVisitaDomiciliarChildThrift, 0, size)
	p.VisitasDomiciliares = tSlice
	for i := 0; i < size; i++ {
		_elem1 := &FichaVisitaDomiciliarChildThrift{}
		if err := _elem1.Read(iprot); err != nil {
			return fmt.Errorf("%T error reading struct: %s", _elem1, err)
		}
		p.VisitasDomiciliares = append(p.VisitasDomiciliares, _elem1)
	}
	if err := iprot.ReadListEnd(); err != nil {
		return fmt.Errorf("error reading list end: %s", err)
	}
	return nil
}

func (p *FichaVisitaDomiciliarMasterThrift) Write(oprot thrift.TProtocol) error {
	if err := oprot.WriteStructBegin("FichaVisitaDomiciliarMasterThrift"); err != nil {
		return fmt.Errorf("%T write struct begin error: %s", p, err)
	}
	if err := p.writeField1(oprot); err != nil {
		return err
	}
	if err := p.writeField2(oprot); err != nil {
		return err
	}
	if err := p.writeField3(oprot); err != nil {
		return err
	}
	if err := p.writeField4(oprot); err != nil {
		return err
	}
	if err := oprot.WriteFieldStop(); err != nil {
		return fmt.Errorf("write field stop error: %s", err)
	}
	if err := oprot.WriteStructEnd(); err != nil {
		return fmt.Errorf("write struct stop error: %s", err)
	}
	return nil
}

func (p *FichaVisitaDomiciliarMasterThrift) writeField1(oprot thrift.TProtocol) (err error) {
	if err := oprot.WriteFieldBegin("uuidFicha", thrift.STRING, 1); err != nil {
		return fmt.Errorf("%T write field begin error 1:uuidFicha: %s", p, err)
	}
	if err := oprot.WriteString(string(p.UuidFicha)); err != nil {
		return fmt.Errorf("%T.uuidFicha (1) field write error: %s", p, err)
	}
	if err := oprot.WriteFieldEnd(); err != nil {
		return fmt.Errorf("%T write field end error 1:uuidFicha: %s", p, err)
	}
	return err
}

func (p *FichaVisitaDomiciliarMasterThrift) writeField2(oprot thrift.TProtocol) (err error) {
	if p.IsSetTpCdsOrigem() {
		if err := oprot.WriteFieldBegin("tpCdsOrigem", thrift.I32, 2); err != nil {
			return fmt.Errorf("%T write field begin error 2:tpCdsOrigem: %s", p, err)
		}
		if err := oprot.WriteI32(int32(*p.TpCdsOrigem)); err != nil {
			return fmt.Errorf("%T.tpCdsOrigem (2) field write error: %s", p, err)
		}
		if err := oprot.WriteFieldEnd(); err != nil {
			return fmt.Errorf("%T write field end error 2:tpCdsOrigem: %s", p, err)
		}
	}
	return err
}

func (p *FichaVisitaDomiciliarMasterThrift) writeField3(oprot thrift.TProtocol) (err error) {
	if p.IsSetHeaderTransport() {
		if err := oprot.WriteFieldBegin("headerTransport", thrift.STRUCT, 3); err != nil {
			return fmt.Errorf("%T write field begin error 3:headerTransport: %s", p, err)
		}
		if err := p.HeaderTransport.Write(oprot); err != nil {
			return fmt.Errorf("%T error writing struct: %s", p.HeaderTransport, err)
		}
		if err := oprot.WriteFieldEnd(); err != nil {
			return fmt.Errorf("%T write field end error 3:headerTransport: %s", p, err)
		}
	}
	return err
}

func (p *FichaVisitaDomiciliarMasterThrift) writeField4(oprot thrift.TProtocol) (err error) {
	if p.IsSetVisitasDomiciliares() {
		if err := oprot.WriteFieldBegin("visitasDomiciliares", thrift.LIST, 4); err != nil {
			return fmt.Errorf("%T write field begin error 4:visitasDomiciliares: %s", p, err)
		}
		if err := oprot.WriteListBegin(thrift.STRUCT, len(p.VisitasDomiciliares)); err != nil {
			return fmt.Errorf("error writing list begin: %s", err)
		}
		for _, v := range p.VisitasDomiciliares {
			if err := v.Write(oprot); err != nil {
				return fmt.Errorf("%T error writing struct: %s", v, err)
			}
		}
		if err := oprot.WriteListEnd(); err != nil {
			return fmt.Errorf("error writing list end: %s", err)
		}
		if err := oprot.WriteFieldEnd(); err != nil {
			return fmt.Errorf("%T write field end error 4:visitasDomiciliares: %s", p, err)
		}
	}
	return err
}

func (p *FichaVisitaDomiciliarMasterThrift) String() string {
	if p == nil {
		return "<nil>"
	}
	return fmt.Sprintf("FichaVisitaDomiciliarMasterThrift(%+v)", *p)
}