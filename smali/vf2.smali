.class public final Lvf2;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lcb2;


# instance fields
.field public final synthetic a:I

.field public final b:Lku5;

.field public final c:Lku5;

.field public final d:Lku5;


# direct methods
.method public constructor <init>(Lku5;Lku5;Lku5;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lvf2;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lvf2;->b:Lku5;

    .line 8
    .line 9
    iput-object p2, p0, Lvf2;->c:Lku5;

    .line 10
    .line 11
    iput-object p3, p0, Lvf2;->d:Lku5;

    .line 12
    .line 13
    return-void
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
.end method

.method public constructor <init>(Lom6;Lku5;Lku5;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lvf2;->a:I

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lvf2;->d:Lku5;

    .line 16
    iput-object p2, p0, Lvf2;->b:Lku5;

    .line 17
    iput-object p3, p0, Lvf2;->c:Lku5;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lvf2;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lvf2;->d:Lku5;

    .line 4
    .line 5
    iget-object v2, p0, Lvf2;->c:Lku5;

    .line 6
    .line 7
    iget-object p0, p0, Lvf2;->b:Lku5;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-interface {p0}, Lmu5;->get()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Le81;

    .line 17
    .line 18
    invoke-interface {v2}, Lmu5;->get()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lmi7;

    .line 23
    .line 24
    invoke-interface {v1}, Lmu5;->get()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Lqe1;

    .line 29
    .line 30
    new-instance v2, Leo6;

    .line 31
    .line 32
    invoke-direct {v2, p0, v0, v1}, Leo6;-><init>(Le81;Lmi7;Lqe1;)V

    .line 33
    .line 34
    .line 35
    return-object v2

    .line 36
    :pswitch_0
    check-cast v1, Lom6;

    .line 37
    .line 38
    iget-object v0, v1, Lom6;->b:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, Landroid/content/Context;

    .line 41
    .line 42
    invoke-interface {p0}, Lmu5;->get()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    check-cast p0, Le81;

    .line 47
    .line 48
    invoke-interface {v2}, Lmu5;->get()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    check-cast v1, Lnm6;

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    new-instance v2, Lbr4;

    .line 64
    .line 65
    new-instance v3, Lgg0;

    .line 66
    .line 67
    const/16 v4, 0x18

    .line 68
    .line 69
    invoke-direct {v3, v4, v1}, Lgg0;-><init>(ILjava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    const/16 v4, 0x9

    .line 73
    .line 74
    invoke-direct {v2, v4, v3}, Lbr4;-><init>(ILjava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    invoke-static {p0}, Lgl0;->E(Le81;)Lig0;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    new-instance v3, Ln20;

    .line 82
    .line 83
    const/16 v4, 0x8

    .line 84
    .line 85
    invoke-direct {v3, v0, v4}, Ln20;-><init>(Landroid/content/Context;I)V

    .line 86
    .line 87
    .line 88
    invoke-static {v1, v2, p0, v3}, Lg22;->n(Ltl6;Lbr4;Lig0;Lsr2;)Ljf1;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    return-object p0

    .line 93
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
