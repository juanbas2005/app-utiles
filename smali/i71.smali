.class public final synthetic Li71;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lgs2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lh06;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Li71;->w:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Li71;->y:Ljava/lang/Object;

    .line 8
    .line 9
    iput-boolean p2, p0, Li71;->x:Z

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

.method public synthetic constructor <init>(Lze7;ZI)V
    .locals 0

    .line 12
    const/4 p3, 0x0

    iput p3, p0, Li71;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li71;->y:Ljava/lang/Object;

    iput-boolean p2, p0, Li71;->x:Z

    return-void
.end method

.method public synthetic constructor <init>(ZLgs2;I)V
    .locals 0

    .line 13
    const/4 p3, 0x2

    iput p3, p0, Li71;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Li71;->x:Z

    iput-object p2, p0, Li71;->y:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final H(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Li71;->w:I

    .line 2
    .line 3
    sget-object v1, Lvs7;->a:Lvs7;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, p0, Li71;->y:Ljava/lang/Object;

    .line 7
    .line 8
    iget-boolean p0, p0, Li71;->x:Z

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast v3, Lgs2;

    .line 14
    .line 15
    check-cast p1, Lyt2;

    .line 16
    .line 17
    check-cast p2, Ljava/lang/Integer;

    .line 18
    .line 19
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-static {v2}, Lb85;->v(I)I

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    invoke-static {p0, v3, p1, p2}, Led1;->e(ZLgs2;Lyt2;I)V

    .line 27
    .line 28
    .line 29
    return-object v1

    .line 30
    :pswitch_0
    check-cast v3, Lh06;

    .line 31
    .line 32
    check-cast p1, Le81;

    .line 33
    .line 34
    check-cast p2, Lc81;

    .line 35
    .line 36
    instance-of v0, p2, Ltr8;

    .line 37
    .line 38
    if-nez v0, :cond_0

    .line 39
    .line 40
    invoke-interface {p1, p2}, Le81;->X(Le81;)Le81;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    goto :goto_1

    .line 45
    :cond_0
    iget-object v0, v3, Lh06;->w:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, Le81;

    .line 48
    .line 49
    sget-object v1, Ltr8;->y:Lz53;

    .line 50
    .line 51
    invoke-interface {v0, v1}, Le81;->a0(Ld81;)Lc81;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    if-nez v0, :cond_2

    .line 56
    .line 57
    if-eqz p0, :cond_1

    .line 58
    .line 59
    check-cast p2, Ltr8;

    .line 60
    .line 61
    new-instance p0, Ltr8;

    .line 62
    .line 63
    iget-object p2, p2, Ltr8;->x:Lts2;

    .line 64
    .line 65
    sget-boolean v0, Lsp8;->a:Z

    .line 66
    .line 67
    invoke-direct {p0, p2, v0}, Ltr8;-><init>(Lts2;Z)V

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_1
    move-object p0, p2

    .line 72
    check-cast p0, Ltr8;

    .line 73
    .line 74
    :goto_0
    invoke-interface {p1, p0}, Le81;->X(Le81;)Le81;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    goto :goto_1

    .line 79
    :cond_2
    iget-object p0, v3, Lh06;->w:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast p0, Le81;

    .line 82
    .line 83
    invoke-interface {p0, v1}, Le81;->L(Ld81;)Le81;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    iput-object p0, v3, Lh06;->w:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast p2, Ltr8;

    .line 90
    .line 91
    invoke-interface {v0, v1}, Le81;->a0(Ld81;)Lc81;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    check-cast p0, Ltr8;

    .line 96
    .line 97
    new-instance p0, Ltr8;

    .line 98
    .line 99
    iget-object p2, p2, Ltr8;->x:Lts2;

    .line 100
    .line 101
    sget-boolean v0, Lsp8;->a:Z

    .line 102
    .line 103
    invoke-direct {p0, p2, v0}, Ltr8;-><init>(Lts2;Z)V

    .line 104
    .line 105
    .line 106
    invoke-interface {p1, p0}, Le81;->X(Le81;)Le81;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    :goto_1
    return-object p0

    .line 111
    :pswitch_1
    check-cast v3, Lze7;

    .line 112
    .line 113
    check-cast p1, Lyt2;

    .line 114
    .line 115
    check-cast p2, Ljava/lang/Integer;

    .line 116
    .line 117
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    invoke-static {v2}, Lb85;->v(I)I

    .line 121
    .line 122
    .line 123
    move-result p2

    .line 124
    invoke-static {v3, p0, p1, p2}, Lpv8;->j(Lze7;ZLyt2;I)V

    .line 125
    .line 126
    .line 127
    return-object v1

    .line 128
    nop

    .line 129
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method
