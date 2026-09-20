.class public final synthetic Lr80;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Lr80;->w:I

    .line 2
    .line 3
    iput-object p1, p0, Lr80;->y:Ljava/lang/Object;

    .line 4
    .line 5
    iput p2, p0, Lr80;->x:I

    .line 6
    .line 7
    iput-object p3, p0, Lr80;->z:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Lr80;->w:I

    .line 2
    .line 3
    iget-object v1, p0, Lr80;->z:Ljava/lang/Object;

    .line 4
    .line 5
    iget v2, p0, Lr80;->x:I

    .line 6
    .line 7
    iget-object p0, p0, Lr80;->y:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p0, Lau1;

    .line 13
    .line 14
    iget-object p0, p0, Lau1;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Lsp5;

    .line 17
    .line 18
    invoke-interface {p0, v2, v1}, Lsp5;->e(ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_0
    check-cast p0, Lpv0;

    .line 23
    .line 24
    check-cast v1, Landroid/content/IntentSender$SendIntentException;

    .line 25
    .line 26
    new-instance v0, Landroid/content/Intent;

    .line 27
    .line 28
    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 29
    .line 30
    .line 31
    const-string v3, "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST"

    .line 32
    .line 33
    invoke-virtual {v0, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const-string v3, "androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION"

    .line 38
    .line 39
    invoke-virtual {v0, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    const/4 v1, 0x0

    .line 44
    invoke-virtual {p0, v2, v1, v0}, Lpv0;->a(IILandroid/content/Intent;)Z

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :pswitch_1
    check-cast p0, Lpv0;

    .line 49
    .line 50
    check-cast v1, Lns8;

    .line 51
    .line 52
    iget-object v0, v1, Lns8;->x:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v0, Ljava/io/Serializable;

    .line 55
    .line 56
    iget-object v1, p0, Lpv0;->a:Ljava/util/LinkedHashMap;

    .line 57
    .line 58
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {v1, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    check-cast v1, Ljava/lang/String;

    .line 67
    .line 68
    if-nez v1, :cond_0

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_0
    iget-object v2, p0, Lpv0;->e:Ljava/util/LinkedHashMap;

    .line 72
    .line 73
    invoke-virtual {v2, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    check-cast v2, Ly8;

    .line 78
    .line 79
    if-eqz v2, :cond_1

    .line 80
    .line 81
    iget-object v3, v2, Ly8;->a:Lr8;

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_1
    const/4 v3, 0x0

    .line 85
    :goto_0
    if-nez v3, :cond_2

    .line 86
    .line 87
    iget-object v2, p0, Lpv0;->g:Landroid/os/Bundle;

    .line 88
    .line 89
    invoke-virtual {v2, v1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    iget-object p0, p0, Lpv0;->f:Ljava/util/LinkedHashMap;

    .line 93
    .line 94
    invoke-interface {p0, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_2
    iget-object v2, v2, Ly8;->a:Lr8;

    .line 99
    .line 100
    iget-object p0, p0, Lpv0;->d:Ljava/util/ArrayList;

    .line 101
    .line 102
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result p0

    .line 106
    if-eqz p0, :cond_3

    .line 107
    .line 108
    invoke-interface {v2, v0}, Lr8;->b(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    :cond_3
    :goto_1
    return-void

    .line 112
    :pswitch_2
    check-cast p0, Ly80;

    .line 113
    .line 114
    check-cast v1, Ljava/lang/CharSequence;

    .line 115
    .line 116
    invoke-virtual {p0, v2, v1}, Ly80;->V(ILjava/lang/CharSequence;)V

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    nop

    .line 121
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
.end method
