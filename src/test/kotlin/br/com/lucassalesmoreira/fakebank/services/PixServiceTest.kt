package br.com.lucassalesmoreira.fakebank.services

import br.com.lucassalesmoreira.fakebank.repositorys.IPixRepository
import br.com.lucassalesmoreira.fakebank.services.implementations.PixServiceImpl
import br.com.lucassalesmoreira.fakebank.utils.DefaultValues
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.kotlin.any
import org.mockito.kotlin.mock
import org.mockito.kotlin.whenever

class PixServiceTest() {

    private lateinit var pixService: PixServiceImpl
    private val iPixRepository: IPixRepository = mock()
    private val iUserService: IUserService = mock()

    @BeforeEach
    fun initialize() {
        pixService = PixServiceImpl(
            iPixRepository,
            iUserService
        )
    }

    @Test
    fun whenSendPix_thenReturnPixOperationResultDTOWithOperationResultFalse() {
        val utils = DefaultValues()

        whenever(iUserService.findById(any()))
            .thenReturn(utils.getUserEntity(100.0))
            .thenReturn(utils.getUserEntity(0.0))

        val result = pixService.sendPix(utils.getPixDTO(100.0)).operationResult
        assert(false == result)
    }

    @Test
    fun whenSendPix_thenReturnPixOperationResultDTOWithOperationResultTrue() {
        val utils = DefaultValues()

        whenever(iUserService.findById(any()))
            .thenReturn(utils.getUserEntity(100.0))
            .thenReturn(utils.getUserEntity(0.0))

        val result = pixService.sendPix(utils.getPixDTO(100.0)).operationResult
        assert(false == result)
    }
}