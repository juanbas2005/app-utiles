.class public final Luf2;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lcb2;


# instance fields
.field public final synthetic a:I

.field public final b:Lom6;

.field public final c:Lku5;


# direct methods
.method public constructor <init>(Lku5;Lom6;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Luf2;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Luf2;->c:Lku5;

    .line 8
    .line 9
    iput-object p2, p0, Luf2;->b:Lom6;

    .line 10
    .line 11
    return-void
    .line 12
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
.end method

.method public synthetic constructor <init>(Lom6;Lku5;I)V
    .locals 0

    .line 12
    iput p3, p0, Luf2;->a:I

    iput-object p1, p0, Luf2;->b:Lom6;

    iput-object p2, p0, Luf2;->c:Lku5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Luf2;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Luf2;->b:Lom6;

    .line 4
    .line 5
    iget-object p0, p0, Luf2;->c:Lku5;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-interface {p0}, Lmu5;->get()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Lhr;

    .line 15
    .line 16
    iget-object v0, v1, Lom6;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Le81;

    .line 19
    .line 20
    new-instance v1, Lg46;

    .line 21
    .line 22
    invoke-direct {v1, p0, v0}, Lg46;-><init>(Lhr;Le81;)V

    .line 23
    .line 24
    .line 25
    return-object v1

    .line 26
    :pswitch_0
    iget-object v0, v1, Lom6;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Landroid/content/Context;

    .line 29
    .line 30
    invoke-interface {p0}, Lmu5;->get()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, Lq18;

    .line 35
    .line 36
    new-instance v1, Ldp5;

    .line 37
    .line 38
    invoke-direct {v1, v0, p0}, Ldp5;-><init>(Landroid/content/Context;Lq18;)V

    .line 39
    .line 40
    .line 41
    return-object v1

    .line 42
    :pswitch_1
    iget-object v0, v1, Lom6;->b:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v0, Landroid/content/Context;

    .line 45
    .line 46
    invoke-interface {p0}, Lmu5;->get()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    check-cast p0, Le81;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    sget-object v1, Lkm6;->w:Lkm6;

    .line 59
    .line 60
    new-instance v2, Lbr4;

    .line 61
    .line 62
    new-instance v3, Lvd2;

    .line 63
    .line 64
    const/4 v4, 0x1

    .line 65
    invoke-direct {v3, v4}, Lvd2;-><init>(I)V

    .line 66
    .line 67
    .line 68
    const/16 v4, 0x9

    .line 69
    .line 70
    invoke-direct {v2, v4, v3}, Lbr4;-><init>(ILjava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    invoke-static {p0}, Lgl0;->E(Le81;)Lig0;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    new-instance v3, Ln20;

    .line 78
    .line 79
    const/4 v4, 0x7

    .line 80
    invoke-direct {v3, v0, v4}, Ln20;-><init>(Landroid/content/Context;I)V

    .line 81
    .line 82
    .line 83
    invoke-static {v1, v2, p0, v3}, Lg22;->n(Ltl6;Lbr4;Lig0;Lsr2;)Ljf1;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    return-object p0

    .line 88
    nop

    .line 89
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method
