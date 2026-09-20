.class public final synthetic Lxb1;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Llb1;


# direct methods
.method public synthetic constructor <init>(Llb1;I)V
    .locals 0

    .line 1
    iput p2, p0, Lxb1;->w:I

    .line 2
    .line 3
    iput-object p1, p0, Lxb1;->x:Llb1;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
    .line 9
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
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Lxb1;->w:I

    .line 2
    .line 3
    iget-object p0, p0, Lxb1;->x:Llb1;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, Landroidx/credentials/exceptions/GetCredentialUnknownException;

    .line 9
    .line 10
    const-string v1, "No provider data returned."

    .line 11
    .line 12
    invoke-direct {v0, v1}, Landroidx/credentials/exceptions/GetCredentialUnknownException;-><init>(Ljava/lang/CharSequence;)V

    .line 13
    .line 14
    .line 15
    check-cast p0, Lkb1;

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Lkb1;->a(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_0
    new-instance v0, Landroidx/credentials/exceptions/GetCredentialUnknownException;

    .line 22
    .line 23
    const-string v1, "Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."

    .line 24
    .line 25
    invoke-direct {v0, v1}, Landroidx/credentials/exceptions/GetCredentialUnknownException;-><init>(Ljava/lang/CharSequence;)V

    .line 26
    .line 27
    .line 28
    check-cast p0, Lkb1;

    .line 29
    .line 30
    invoke-virtual {p0, v0}, Lkb1;->a(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :pswitch_1
    invoke-static {p0}, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->$r8$lambda$eKxW_gs1lUPICybr1syVFaQsVp0(Llb1;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :pswitch_2
    invoke-static {p0}, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->$r8$lambda$v2_cK85gsZZQw32xnN1qU13GbKQ(Llb1;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :pswitch_3
    invoke-static {p0}, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->$r8$lambda$e26-TJ45BetGQtJZIcAQ5s9rm3c(Llb1;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :pswitch_4
    invoke-static {p0}, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->$r8$lambda$27hAKj8hhFiHQnNA1lTKsiG-Oxw(Llb1;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :pswitch_5
    invoke-static {p0}, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->$r8$lambda$ZmeORH0b9a1FJ17DY04w0WU6DDE(Llb1;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :pswitch_6
    invoke-static {p0}, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->$r8$lambda$v5kLi_w59Ybz8Cu6DmJc3hm3YW4(Llb1;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :pswitch_7
    invoke-static {p0}, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->$r8$lambda$hCjUIdJpkFZZ_R4jPEVDfW9xTXk(Llb1;)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
