package org.example.princess_group.domain.card.service;

import org.example.princess_group.domain.card.dto.ChangeOrderRequest;
import org.example.princess_group.domain.card.dto.ChangeOrderResponse;
import org.example.princess_group.domain.card.dto.CreateCardRequest;
import org.example.princess_group.domain.card.dto.CreateCardResponse;
import org.example.princess_group.domain.card.dto.UpdateCardRequest;
import org.example.princess_group.domain.card.dto.UpdateCardResponse;
import org.springframework.stereotype.Service;

@Service
public class CardService {

    public CreateCardResponse createCard(CreateCardRequest request) {
        return null;
    }

    public UpdateCardResponse updateCard(UpdateCardRequest request) {
        return null;
    }

    public void deleteCard(Long cardId) {

    }

    public ChangeOrderResponse changeOrder(Long cardId, ChangeOrderRequest request) {
        return null;
    }
}
