.class public final Lkv8;
.super Ltw8;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final synthetic A:I

.field public final synthetic B:Lyw8;

.field public final synthetic C:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lyw8;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lkv8;->A:I

    .line 3
    .line 4
    iput-object p2, p0, Lkv8;->C:Ljava/lang/Object;

    .line 5
    .line 6
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lkv8;->B:Lyw8;

    .line 10
    .line 11
    invoke-direct {p0, p1, v0}, Ltw8;-><init>(Lyw8;Z)V

    .line 12
    .line 13
    .line 14
    return-void
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
.end method

.method public constructor <init>(Lyw8;Ljava/lang/Exception;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lkv8;->A:I

    .line 16
    iput-object p2, p0, Lkv8;->C:Ljava/lang/Object;

    iput-object p1, p0, Lkv8;->B:Lyw8;

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Ltw8;-><init>(Lyw8;Z)V

    return-void
.end method

.method public synthetic constructor <init>(Lyw8;Ljava/lang/Object;I)V
    .locals 0

    .line 15
    iput p3, p0, Lkv8;->A:I

    iput-object p2, p0, Lkv8;->C:Ljava/lang/Object;

    iput-object p1, p0, Lkv8;->B:Lyw8;

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Ltw8;-><init>(Lyw8;Z)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 8

    .line 1
    iget v0, p0, Lkv8;->A:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lkv8;->B:Lyw8;

    .line 7
    .line 8
    iget-object v0, v0, Lyw8;->f:Lcu8;

    .line 9
    .line 10
    invoke-static {v0}, Lz65;->k(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, Lkv8;->C:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Lww8;

    .line 16
    .line 17
    invoke-interface {v0, p0}, Lcu8;->registerOnMeasurementEventListener(Ltu8;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_0
    iget-object v0, p0, Lkv8;->B:Lyw8;

    .line 22
    .line 23
    iget-object v1, v0, Lyw8;->f:Lcu8;

    .line 24
    .line 25
    invoke-static {v1}, Lz65;->k(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, Lkv8;->C:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p0, Ljava/lang/Exception;

    .line 31
    .line 32
    new-instance v4, Lz25;

    .line 33
    .line 34
    invoke-direct {v4, p0}, Lz25;-><init>(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    new-instance v5, Lz25;

    .line 38
    .line 39
    const/4 p0, 0x0

    .line 40
    invoke-direct {v5, p0}, Lz25;-><init>(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    new-instance v6, Lz25;

    .line 44
    .line 45
    invoke-direct {v6, p0}, Lz25;-><init>(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    const/4 v2, 0x5

    .line 49
    const-string v3, "Error with data collection. Data lost."

    .line 50
    .line 51
    invoke-interface/range {v1 .. v6}, Lcu8;->logHealthData(ILjava/lang/String;Ly73;Ly73;Ly73;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :pswitch_1
    iget-object v0, p0, Lkv8;->B:Lyw8;

    .line 56
    .line 57
    iget-object v0, v0, Lyw8;->f:Lcu8;

    .line 58
    .line 59
    invoke-static {v0}, Lz65;->k(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    iget-object v1, p0, Lkv8;->C:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v1, Lc49;

    .line 65
    .line 66
    new-instance v2, Lxv8;

    .line 67
    .line 68
    invoke-direct {v2, p0, v1}, Lxv8;-><init>(Lkv8;Lc49;)V

    .line 69
    .line 70
    .line 71
    invoke-interface {v0, v2}, Lcu8;->retrieveAndUploadBatches(Lpu8;)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :pswitch_2
    iget-object v0, p0, Lkv8;->B:Lyw8;

    .line 76
    .line 77
    iget-object v0, v0, Lyw8;->f:Lcu8;

    .line 78
    .line 79
    invoke-static {v0}, Lz65;->k(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    iget-object v1, p0, Lkv8;->C:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v1, Landroid/os/Bundle;

    .line 85
    .line 86
    iget-wide v2, p0, Ltw8;->w:J

    .line 87
    .line 88
    invoke-interface {v0, v1, v2, v3}, Lcu8;->setConditionalUserProperty(Landroid/os/Bundle;J)V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :pswitch_3
    iget-object v0, p0, Lkv8;->B:Lyw8;

    .line 93
    .line 94
    iget-object v1, v0, Lyw8;->f:Lcu8;

    .line 95
    .line 96
    invoke-static {v1}, Lz65;->k(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    iget-object v0, p0, Lkv8;->C:Ljava/lang/Object;

    .line 100
    .line 101
    new-instance v4, Lz25;

    .line 102
    .line 103
    invoke-direct {v4, v0}, Lz25;-><init>(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    const/4 v5, 0x1

    .line 107
    iget-wide v6, p0, Ltw8;->w:J

    .line 108
    .line 109
    const-string v2, "fcm"

    .line 110
    .line 111
    const-string v3, "_ln"

    .line 112
    .line 113
    invoke-interface/range {v1 .. v7}, Lcu8;->setUserProperty(Ljava/lang/String;Ljava/lang/String;Ly73;ZJ)V

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method
