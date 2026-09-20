.class public final Lo67;
.super Lwx3;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lgs2;


# instance fields
.field public final synthetic x:I

.field public final synthetic y:Lp67;


# direct methods
.method public synthetic constructor <init>(Lp67;I)V
    .locals 0

    .line 1
    iput p2, p0, Lo67;->x:I

    .line 2
    .line 3
    iput-object p1, p0, Lo67;->y:Lp67;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1}, Lwx3;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
    .line 10
    .line 11
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


# virtual methods
.method public final H(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lo67;->x:I

    .line 2
    .line 3
    sget-object v1, Lvs7;->a:Lvs7;

    .line 4
    .line 5
    iget-object p0, p0, Lo67;->y:Lp67;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Luy3;

    .line 11
    .line 12
    check-cast p2, Lp67;

    .line 13
    .line 14
    iget-object p2, p0, Lp67;->a:Ls67;

    .line 15
    .line 16
    iget-object v0, p1, Luy3;->c0:Liz3;

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    new-instance v0, Liz3;

    .line 21
    .line 22
    invoke-direct {v0, p1, p2}, Liz3;-><init>(Luy3;Ls67;)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p1, Luy3;->c0:Liz3;

    .line 26
    .line 27
    :cond_0
    iput-object v0, p0, Lp67;->b:Liz3;

    .line 28
    .line 29
    invoke-virtual {p0}, Lp67;->a()Liz3;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1}, Liz3;->h()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lp67;->a()Liz3;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    iget-object p1, p0, Liz3;->y:Ls67;

    .line 41
    .line 42
    if-eq p1, p2, :cond_1

    .line 43
    .line 44
    iput-object p2, p0, Liz3;->y:Ls67;

    .line 45
    .line 46
    const/4 p1, 0x0

    .line 47
    invoke-virtual {p0, p1}, Liz3;->i(Z)V

    .line 48
    .line 49
    .line 50
    iget-object p0, p0, Liz3;->w:Luy3;

    .line 51
    .line 52
    const/4 p2, 0x7

    .line 53
    invoke-static {p0, p1, p2}, Luy3;->Z(Luy3;ZI)V

    .line 54
    .line 55
    .line 56
    :cond_1
    return-object v1

    .line 57
    :pswitch_0
    check-cast p1, Luy3;

    .line 58
    .line 59
    check-cast p2, Lgs2;

    .line 60
    .line 61
    invoke-virtual {p0}, Lp67;->a()Liz3;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    iget-object v0, p0, Liz3;->L:Ljava/lang/String;

    .line 66
    .line 67
    new-instance v2, Lez3;

    .line 68
    .line 69
    invoke-direct {v2, p0, p2, v0}, Lez3;-><init>(Liz3;Lgs2;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, v2}, Luy3;->g0(Llh4;)V

    .line 73
    .line 74
    .line 75
    return-object v1

    .line 76
    :pswitch_1
    check-cast p1, Luy3;

    .line 77
    .line 78
    check-cast p2, Lky0;

    .line 79
    .line 80
    invoke-virtual {p0}, Lp67;->a()Liz3;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    iput-object p2, p0, Liz3;->x:Lky0;

    .line 85
    .line 86
    return-object v1

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method
